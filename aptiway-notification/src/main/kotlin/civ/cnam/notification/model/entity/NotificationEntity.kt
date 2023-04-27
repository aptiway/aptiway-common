package civ.cnam.notification.model.entity

class NotificationEntity(
    var recipient: String,
    var clientId: String,
    var body: String,
    var subject: String?,
    var sender: String
)