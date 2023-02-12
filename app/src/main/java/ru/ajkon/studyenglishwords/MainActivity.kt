package ru.ajkon.studyenglishwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.View
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickEditWordButton(view: View) {
        val intent = Intent(this, WordEditActivity::class.java)
        startActivity(intent)
    }

    fun onClickExitButton(view: View) {
        finish()
        exitProcess(0)
    }

}