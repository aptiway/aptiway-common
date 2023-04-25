package civ.cnam.notification.adaptor.function

import civ.cnam.notification.adaptor.service.EmailNotificationService
import civ.cnam.notification.adaptor.service.SMSNotificationService
import civ.cnam.notification.model.NotificationChannel
import civ.cnam.notification.service.NotificationService
import org.slf4j.LoggerFactory

class NotificationServiceProvider {

    private val logger = LoggerFactory.getLogger(NotificationServiceProvider::class.java)
    fun lookupNotificationService(clientId: String, notificationChannel: NotificationChannel): NotificationService {
        val notificationService: NotificationService = return when (notificationChannel) {
            NotificationChannel.SMS -> SMSNotificationService()
            NotificationChannel.EMAIL -> EmailNotificationService()
        }
        return notificationService
    }
}