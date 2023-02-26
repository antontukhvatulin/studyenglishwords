package ru.ajkon.studyenglishwords.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class ViewControl(val main: AppCompatActivity) {



    fun showEditWord() {
        val intent = Intent(main, WordEditActivity::class.java)

        main.startActivity(intent)
    }

    fun finishEditWord(activity: AppCompatActivity, isOk: Boolean) {
        activity.finish()
    }

    fun exit() {
        main.finish()
        exitProcess(0)
    }
}