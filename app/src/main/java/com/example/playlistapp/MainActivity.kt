package com.example.playlistapp

import android.os.Bundle
import com.example.playlistapp.base.BindingActivity
import com.example.playlistapp.databinding.ActivityMainBinding

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_song)
    }
}