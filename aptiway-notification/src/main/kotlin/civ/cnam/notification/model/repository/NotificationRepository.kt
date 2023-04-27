package civ.cnam.notification.model.repository

import civ.cnam.notification.model.entity.NotificationEntity

interface NotificationRepository {
    fun findById(recipient: String): NotificationEntity?
}