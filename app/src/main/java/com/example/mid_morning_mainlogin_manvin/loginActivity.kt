package com.example.mid_morning_mainlogin_manvin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class loginActivity : AppCompatActivity() {
    lateinit var texttoregister:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        texttoregister=findViewById(R.id.Txt_gotoregister)

        texttoregister.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }





    }
}