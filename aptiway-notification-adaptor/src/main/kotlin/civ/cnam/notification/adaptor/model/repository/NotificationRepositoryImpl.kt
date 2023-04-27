package civ.cnam.notification.adaptor.model.repository

import civ.cnam.notification.model.entity.NotificationEntity
import civ.cnam.notification.model.repository.NotificationRepository

class NotificationRepositoryImpl : NotificationRepository {
    override fun findById(recipient: String): NotificationEntity? {
        TODO("Not yet implemented")
    }

}