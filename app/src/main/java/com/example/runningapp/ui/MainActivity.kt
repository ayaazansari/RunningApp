package com.example.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import com.example.runningapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var runDao:RunDAO

}