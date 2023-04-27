package civ.cnam.notification.model

class Notification {
    var recipient: String = ""
    var clientId: String = ""
    var body: String = ""
    var subject: String? = null
    var sender: String = ""

    constructor() {
    }
}