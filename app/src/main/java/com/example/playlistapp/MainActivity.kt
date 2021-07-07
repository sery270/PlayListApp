package com.example.playlistapp

import android.os.Bundle
import com.example.playlistapp.base.BindingActivity
import com.example.playlistapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main)