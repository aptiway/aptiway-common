package civ.cnam.notification.adaptor.function

import civ.cnam.notification.function.TemplateReader
import civ.cnam.notification.model.Notification
import civ.cnam.notification.model.NotificationRequest
import civ.cnam.notification.model.Template
import civ.cnam.notification.service.NotificationService
import org.slf4j.LoggerFactory


class NotificationSender(
    private var templateReader: TemplateReader,
    private val notificationServiceProvider: NotificationServiceProvider
) {
    private val logger = LoggerFactory.getLogger(NotificationSender::class.java)

    private val templateFlag: Boolean = false
    private fun send(notificationRequest: NotificationRequest) {
        logger.debug("NotificationSender - send method started")

        val template: Template
        if (templateFlag) {
            templateReader = ResourceTemplateReader()
            template = templateReader.readTemplate(notificationRequest.templateName)
        } else {
            templateReader = DatabaseTemplateReader()
            template = templateReader.readTemplate(notificationRequest.templateName)
        }

        val notification: Notification = template.generateNotification(notificationRequest)

        val notificationService: NotificationService = notificationServiceProvider.lookupNotificationService(
            notificationRequest.clientId,
            notificationRequest.notificationChannel
        )
        notificationService.send(notification)
        logger.debug("NotificationSender - send method completed")
    }
}