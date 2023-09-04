package io.rvnmrqz.uidemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.google.android.material.button.MaterialButton
import io.rvnmrqz.uidemo.layouts.FirstLayoutActivity
import io.rvnmrqz.uidemo.layouts.FourthLayoutActivity
import io.rvnmrqz.uidemo.layouts.SecondLayoutActivity
import io.rvnmrqz.uidemo.layouts.ThirdLayoutActivity

class MainActivity : AppCompatActivity(), OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.btnLayout1).setOnClickListener(this)
        findViewById<MaterialButton>(R.id.btnLayout2).setOnClickListener(this)
        findViewById<MaterialButton>(R.id.btnLayout3).setOnClickListener(this)
        findViewById<MaterialButton>(R.id.btnLayout4).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnLayout1 -> startActivity(Intent(this, FirstLayoutActivity::class.java))
            R.id.btnLayout2 -> startActivity(Intent(this, SecondLayoutActivity::class.java))
            R.id.btnLayout3 -> startActivity(Intent(this, ThirdLayoutActivity::class.java))
            R.id.btnLayout4 -> startActivity(Intent(this, FourthLayoutActivity::class.java))
        }
    }
}