package civ.cnam.notification.model

class Notification(
    val recipient: String,
    val clientId: String,
    val body: String,
    val subject: String?,
    val sender: String
)