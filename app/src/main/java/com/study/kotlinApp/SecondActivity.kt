package com.study.kotlinApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.lzq.kotlinApp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val secondBinding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)
//        setContentView(R.layout.activity_second)
        secondBinding.viewClick = View.OnClickListener {
            when (it.id) {
                R.id.my_tv -> {
                    val makeText = Toast.makeText(this, "This is kotlin", Toast.LENGTH_LONG)
                    makeText.show()
                }
            }
        }
    }
}
