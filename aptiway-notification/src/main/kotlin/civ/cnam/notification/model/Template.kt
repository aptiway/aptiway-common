package civ.cnam.notification.model

class Template(
    val name: String,
    val clientID: String,
    private val dbParameters: List<Parameter>?,
    private val resourceParameters: List<ResourceParameter>?
) {

    private val SUBJECT = "Subject"
    private val BODY = "Body"

    fun generateNotification(notificationRequest: NotificationRequest): Notification {

        val notification = Notification()

        dbParameters?.forEach { parameter: Parameter ->
            if (parameter.name == SUBJECT) {
                notification.subject = parameter.value
            }
            if (parameter.name == BODY) {
                notification.body = parameter.value
            }

        }

        resourceParameters?.forEach { resourceParameter: ResourceParameter ->

            notification.subject = resourceParameter.value

            notification.body = resourceParameter.value


        }


        return notification
    }

}