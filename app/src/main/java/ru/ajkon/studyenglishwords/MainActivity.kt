package ru.ajkon.studyenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickExitButton() {
        finish()
        exitProcess(0)
    }


}