package civ.cnam.notification.function

import civ.cnam.notification.model.Template

interface TemplateReader {
    fun readTemplate(templateName: String, clientId: String, recipient: String): Template
}