package civ.cnam.notification.adaptor.function

import civ.cnam.notification.function.TemplateReader
import civ.cnam.notification.model.Template

class ResourceTemplateReader : TemplateReader {
    override fun readTemplate(name: String): Template {
        return Template("apple","123456789")
    }
}