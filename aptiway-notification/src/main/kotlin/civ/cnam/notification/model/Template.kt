package civ.cnam.notification.model

class Template(val name:String,val clientID:String) {
    fun generateNotification(notificationRequest: NotificationRequest):Notification {
        return Notification("abc","123456","some body message","","")
    }

}