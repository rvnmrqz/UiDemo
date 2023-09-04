package io.rvnmrqz.uidemo.utils


import android.annotation.SuppressLint
import android.view.MotionEvent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView

class RecyclerPageSnapper : PagerSnapHelper() {

    private var pageIndex = -1
    private var recyclerView: RecyclerView? = null

    var onPageChangedListener: OnPageChangedListener? = null
        @SuppressLint("ClickableViewAccessibility")
        set(value) {
            val layoutManager = recyclerView?.layoutManager as LinearLayoutManager
            layoutManager.recycleChildrenOnDetach = true

            recyclerView?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)

                    // Find the currently snapped position
                    val snapPosition = layoutManager.findFirstCompletelyVisibleItemPosition()

                    // Do something when the page changes
                    if (snapPosition != -1 && pageIndex != snapPosition) {
                        pageIndex = snapPosition
                        onPageChangedListener?.onPageChanged(pageIndex)
                    }
                }
            })

            // Implementing this will override the behavior of the recyclerview
            // and will only trigger the touch events when the user released/stops interacting with the recyclerview
            recyclerView?.setOnTouchListener { v, event ->
                if (event.action == MotionEvent.ACTION_UP) v.performClick()
                false
            }

            field = value
        }

    override fun attachToRecyclerView(recyclerView: RecyclerView?) {
        super.attachToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    interface OnPageChangedListener {
        fun onPageChanged(position: Int)
    }
}
