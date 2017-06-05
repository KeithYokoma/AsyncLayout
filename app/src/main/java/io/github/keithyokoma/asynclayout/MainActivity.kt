package io.github.keithyokoma.asynclayout

import android.os.Bundle
import android.os.Trace
import android.support.v4.view.AsyncLayoutInflater
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Trace.beginSection("Inflate!")
        AsyncLayoutInflater(this).inflate(R.layout.activity_main, null, { view, _, _ -> run {
            setContentView(view)
            Trace.endSection()
        }})
    }
}
