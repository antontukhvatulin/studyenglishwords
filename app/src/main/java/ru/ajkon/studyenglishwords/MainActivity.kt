package ru.ajkon.studyenglishwords

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ru.ajkon.studyenglishwords.view.ViewControl

class MainActivity : AppCompatActivity() {
    private val vc: ViewControl = ViewControl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun onClickEditWordButton(view: View) {
        vc.showEditWord()
    }

    fun onClickExitButton(view: View) {
        vc.exit()
    }

}