package com.main.bluchat.main.data

import com.main.bluchat.core.data.BaseFragment
import com.main.bluchat.features.chat.add.presentation.ui.AddChatFragment
import com.main.bluchat.features.chats.presentation.ui.ChatsFragment

sealed class Screen {

    abstract fun fragment(): Class<out BaseFragment<*>>

    object Chats : Screen() {
        override fun fragment(): Class<out BaseFragment<*>> = ChatsFragment::class.java
    }

    object AddChat : Screen() {
        override fun fragment(): Class<out BaseFragment<*>> = AddChatFragment::class.java
    }
}