package com.jetbrains.rider.plugins.unreal.actions

import com.intellij.notification.Notification
import com.intellij.notification.NotificationAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.jetbrains.rider.model.rdRiderModel
import com.jetbrains.rider.projectView.solution

open class EnableAutoUpdatePlugin : NotificationAction("Enable Auto-Update") {
    override fun actionPerformed(e: AnActionEvent, notifcation:Notification) {
        notifcation.expire()
        val project = e.project ?: return
        e.presentation.isEnabled = false
        project.solution.rdRiderModel.enableAutoupdatePlugin.fire(Unit)
    }
}