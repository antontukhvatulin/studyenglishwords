package ru.ajkon.studyenglishwords.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.ajkon.studyenglishwords.R

class WordEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_edit)
    }

    fun onClickCloseButton(view: View) {
        finish()
    }

    fun onClickOkButton(view: View) {
        finish()
    }

}