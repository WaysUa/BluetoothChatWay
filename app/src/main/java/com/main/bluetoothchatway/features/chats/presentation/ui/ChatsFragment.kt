package com.main.bluetoothchatway.features.chats.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.main.bluetoothchatway.core.base.BaseFragment
import com.main.bluetoothchatway.databinding.FragmentChatsBinding

class ChatsFragment : BaseFragment() {
    private val binding by lazy { FragmentChatsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNewChat.setOnClickListener {

        }
    }
}