package civ.cnam.notification.model

data class NotificationRequest(
    val clientId: String,
    val mobileNumber: String,
    val emailAddress: String,
    val templateName: String,
    val notificationChannel: NotificationChannel,
    val parameter: Parameter

)



