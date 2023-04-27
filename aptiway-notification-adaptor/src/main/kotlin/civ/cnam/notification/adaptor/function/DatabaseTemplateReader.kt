package civ.cnam.notification.adaptor.function

import civ.cnam.notification.adaptor.model.repository.NotificationRepositoryImpl
import civ.cnam.notification.function.TemplateReader
import civ.cnam.notification.model.Parameter
import civ.cnam.notification.model.ResourceParameter
import civ.cnam.notification.model.Template


class DatabaseTemplateReader : TemplateReader {

    val NotificationRepositoryImpl = NotificationRepositoryImpl()

    override fun readTemplate(templateName: String, clientId: String, recipient: String): Template {
        val dbParameters = mutableListOf<Parameter>()

        val notificationEntity = NotificationRepositoryImpl.findById(recipient);
        val parameter = Parameter()
        parameter.name = "recipient"
        if (notificationEntity != null) {
            parameter.value = notificationEntity.recipient
            dbParameters.add(parameter)
        }
        return Template(templateName, "", dbParameters, null)
    }
}