package civ.cnam.notification.model

data class NotificationRequest(
    val clientId: String,
    val recipient:String,
    val templateName: String,
    val notificationChannel: NotificationChannel,
    val parameters: List<Parameter>

)



