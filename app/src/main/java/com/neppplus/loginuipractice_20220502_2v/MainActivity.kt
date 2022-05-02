package com.neppplus.loginuipractice_20220502_2v

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn.setOnClickListener { 
            Log.d("MainActivity_회원가입", "버튼 클릭됨")
        }
        
        loginBtn.setOnClickListener {
            Toast.makeText(this, "로그인을 환영합니다.", Toast.LENGTH_SHORT).show()
        }
    }
}