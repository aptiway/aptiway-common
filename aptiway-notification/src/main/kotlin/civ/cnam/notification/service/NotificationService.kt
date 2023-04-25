package civ.cnam.notification.service

import civ.cnam.notification.model.Notification

interface NotificationService {
   fun send(notification: Notification)
}