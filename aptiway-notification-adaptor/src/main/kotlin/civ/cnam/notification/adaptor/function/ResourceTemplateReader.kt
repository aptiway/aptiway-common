package civ.cnam.notification.adaptor.function

import civ.cnam.notification.function.TemplateReader
import civ.cnam.notification.model.ResourceParameter
import civ.cnam.notification.model.Template
import java.io.File

class ResourceTemplateReader : TemplateReader {

    override fun readTemplate(templateName: String, clientId: String, recipient: String): Template {
        val resourceParameters = mutableListOf<ResourceParameter>()

        val file = File("")
        val fileContents = file.readLines()

        fileContents.forEach {
            val resourceParameter = ResourceParameter(it)
            resourceParameters.add(resourceParameter)
        }

        return Template(templateName, clientId, null, resourceParameters)
    }
}