package ru.ajkon.studyenglishwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WordEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_edit)
    }

    fun onClickCloseButton(view: View) {
        this.finish()
    }

    fun onClickOkButton(view: View) {}

}