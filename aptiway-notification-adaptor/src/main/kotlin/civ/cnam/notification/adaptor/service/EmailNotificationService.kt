package civ.cnam.notification.adaptor.service

import civ.cnam.notification.model.Notification
import civ.cnam.notification.service.NotificationService
import java.net.PasswordAuthentication
import java.util.*
import javax.mail.Authenticator
import javax.mail.Message
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class EmailNotificationService : NotificationService {
    override fun send(notification: Notification) {

        val properties = Properties()
        properties["mail.smtp.auth"] = "true"
        properties["mail.smtp.starttls.enable"] = "true"
        properties["mail.smtp.host"] = "smtp.gmail.com"
        properties["mail.smtp.port"] = "587"

        val username = "your-email@gmail.com" // Replace with your Gmail address
        val password = "your-password" // Replace with your Gmail password

        val session = Session.getInstance(properties, object : Authenticator() {
            override fun getPasswordAuthentication(): javax.mail.PasswordAuthentication? {
                return javax.mail.PasswordAuthentication(username, password)
            }
        })

        val message = MimeMessage(session)
        message.setFrom(InternetAddress(username))
        message.addRecipient(Message.RecipientType.TO, InternetAddress(notification.recipient))
        message.subject = notification.subject
        message.setText(notification.body)

        Transport.send(message)
    }
}