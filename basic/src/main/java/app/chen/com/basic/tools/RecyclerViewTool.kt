package app.chen.com.basic.tools

import android.app.Activity
import android.support.v7.widget.*


/**
 * RecyclerView布局Manager
 *
 * @param recyclerView
 */
fun setHorizontalManager(activity :Activity,recyclerView: RecyclerView): LinearLayoutManager {
    val layoutManager = LinearLayoutManager(activity)//线型显示
    layoutManager.orientation = LinearLayoutManager.HORIZONTAL//设置滚动方向
    recyclerView.setHasFixedSize(true)
    recyclerView.layoutManager = layoutManager
    recyclerView.itemAnimator = DefaultItemAnimator()//设置动画
    return layoutManager
}


/**
 * RecyclerView布局Manager
 *
 * @param recyclerView
 */
fun setVerticalManager(activity :Activity,recyclerView: RecyclerView): LinearLayoutManager {
    val layoutManager = LinearLayoutManager(activity)//线型显示
    layoutManager.orientation = LinearLayoutManager.VERTICAL//设置滚动方向
    recyclerView.setHasFixedSize(true)
    recyclerView.layoutManager = layoutManager
    recyclerView.itemAnimator = DefaultItemAnimator()//设置动画
    return layoutManager
}

/**
 * RecyclerView布局Manager
 *
 * @param recyclerView
 */
fun setGridManager(activity :Activity,recyclerView: RecyclerView, spanCount: Int): GridLayoutManager {
    val gridLayoutManager = GridLayoutManager(activity, spanCount)
    gridLayoutManager.orientation = LinearLayoutManager.VERTICAL//设置滚动方向
    recyclerView.setHasFixedSize(true)
    recyclerView.layoutManager = gridLayoutManager
    recyclerView.itemAnimator = DefaultItemAnimator()//设置动画
    return gridLayoutManager
}

/**
 * RecyclerView布局Manager
 *
 * @param recyclerView
 */
fun setStaggeredGrid(recyclerView: RecyclerView, spanCount: Int): StaggeredGridLayoutManager {
    val staggeredGridLayoutManager = StaggeredGridLayoutManager(spanCount, OrientationHelper.VERTICAL)//这里用线性宫格显示 类似于瀑布流
    recyclerView.layoutManager = staggeredGridLayoutManager
    return staggeredGridLayoutManager
}