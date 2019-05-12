package com.demo.kotlinproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),View.OnClickListener{
    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_login ->startMainActivity()
        }
    }

    private fun startMainActivity(){
       val intent:Intent = Intent()
        intent.setClass(this,MainActivity().javaClass)
        startActivity(intent)
        //intent.setClass(this,MainActivity::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_title.text = "登录"
        btn_login.text = "登录"


    }



}