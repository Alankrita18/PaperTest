package com.alankrita.kitchensink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import io.paperdb.Paper
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Paper.init(this)

        Paper.book().write("hello","heyy")
        val hello = Paper.book().read("hello", "default")
//        val handler = Handler()
//        handler.postDelayed(Runnable { // Do something after 5s = 5000ms
//              val hello = Paper.book().read("hello", "default")
//        }, 60000)
    }
}