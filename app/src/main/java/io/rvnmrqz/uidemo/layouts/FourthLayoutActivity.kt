package io.rvnmrqz.uidemo.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.rvnmrqz.uidemo.R
import io.rvnmrqz.uidemo.adapter.CardAdapter
import io.rvnmrqz.uidemo.adapter.ListAdapter
import io.rvnmrqz.uidemo.utils.RecyclerPageSnapper

class FourthLayoutActivity : AppCompatActivity(), RecyclerPageSnapper.OnPageChangedListener {
    private val TAG = "FourthLayoutActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_layout)

        // card recyclerview
        val cardRecyclerView = findViewById<RecyclerView>(R.id.cardRecyclerView)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        cardRecyclerView.layoutManager = layoutManager

        // card adapter
        val cardsAdapter = CardAdapter()
        cardRecyclerView.adapter = cardsAdapter

        // to help with card snapping when scrolled
        val pagerSnapHelper = RecyclerPageSnapper()
        pagerSnapHelper.attachToRecyclerView(cardRecyclerView)
        pagerSnapHelper.onPageChangedListener = this


        // details recyclerview + adapter
        val listRecyclerView = findViewById<RecyclerView>(R.id.listRecyclerView)
        listRecyclerView.adapter = ListAdapter()

    }

    override fun onPageChanged(position: Int) {
        // perform you business logic here
        println("Page changed!! $position")
    }


}