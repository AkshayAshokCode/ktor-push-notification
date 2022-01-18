package com.plcoding.data.remote

import com.plcoding.data.remote.dto.Notification

interface OneSignalService {
    suspend fun sendNotification(notification: Notification):Boolean

    companion object{
        const val ONESIGNAL_APP_ID="877b0e06-ce04-4a62-9e8d-7dced205058e"

        const val NOTIFICATIONS = "https://onesignal.com/api/v1/notifications"
    }
}