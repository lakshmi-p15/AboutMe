package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done).setOnClickListener {
            addNickname(it)

        }
    }

    fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nickName_textView = findViewById<TextView>(R.id.nickname_text)

        nickName_textView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nickName_textView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}