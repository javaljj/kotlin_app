package com.javalj.kotlinapp.ui.base

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.javalj.kotlinapp.R
import org.jetbrains.anko.find

/**
 * Created by lijie on 2016/2/16.
 */
public class BaseListAdapter<E>(val list: MutableList<E>, val context: Context) : BaseAdapter() {
    private lateinit var mList: MutableList<E>
    private lateinit var mContext: Context

    init {
        mList = list
        mContext = context
    }

    override fun getItem(p0: Int): Any? = mList.get(p0)

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getCount(): Int = mList?.size

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var view = p1
        var viewHolder: ViewHolder
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.xxx, null)
            viewHolder = ViewHolder(view)
            viewHolder.text = view.find<TextView>(R.id.text)
            view.tag = viewHolder
        } else {
            viewHolder = view!!.tag as ViewHolder
        }
        var item = getItem(p0)
        viewHolder.text?.text = item.toString()
        return view
    }

    class ViewHolder(view: View) {
        var text: TextView? = null
    }
}