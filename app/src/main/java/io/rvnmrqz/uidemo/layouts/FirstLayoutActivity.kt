package io.rvnmrqz.uidemo.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import io.rvnmrqz.uidemo.R
import io.rvnmrqz.uidemo.adapter.ListAdapter

class FirstLayoutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_layout)

        val recyclerView = findViewById<RecyclerView>(R.id.listRecyclerView)
        recyclerView.adapter = ListAdapter()
    }
}