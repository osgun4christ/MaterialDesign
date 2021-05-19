package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()

    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signinButton = findViewById<MaterialButton>(R.id.next_button)

        signinButton.setOnClickListener {
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Please provide email or password", Toast.LENGTH_SHORT).show()
            } else {
                if (email.text.toString() == "osgun4christ@gmail.com" && password.text.toString() == "iLoveJESUS"){
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}
