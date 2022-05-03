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
        val id = "admin"
        val password = "asdf"

        loginBtn.setOnClickListener { 
            val inputId = inputIdEdt.text.toString()
            val inputPw = inputPwEdt.text.toString()
            
//            if (inputId == id && inputPw == password) {
//                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//            } else if (inputId != id) {
//                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            }
//            else {
//                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            }
            
//            if (inputId == id) {
//                if (inputPw == password) {
//                    Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//                }
//            } else {
//                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            }

            when (inputId) {
                id -> {
                    if (inputPw == password) {
                        Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
                    }
                }
                else -> {
                    Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}