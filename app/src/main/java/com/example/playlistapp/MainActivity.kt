package com.example.playlistapp

import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.playlistapp.base.BindingActivity
import com.example.playlistapp.databinding.ActivityMainBinding
import com.example.playlistapp.presentation.PlayListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<PlayListFragment>(R.id.fragment_container_view)
            }
        }
    }
}