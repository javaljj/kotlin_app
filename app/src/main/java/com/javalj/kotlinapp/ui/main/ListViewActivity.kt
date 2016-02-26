package com.javalj.kotlinapp.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log.*
import android.widget.ListView
import com.javalj.kotlinapp.R
import com.javalj.kotlinapp.ui.base.BaseListAdapter
import org.jetbrains.anko.find

/**
 * Created by lijie on 2016/2/26.
 */
public class ListViewActivity : AppCompatActivity() {

    lateinit var list: MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.list_view_activity)
        list = arrayListOf()
        for (i in 0..10) {
            //            list.add(i.toString())
            list.add(i.toString())
        }
        d("TAG", list.toString())
        val listView = find<ListView>(R.id.listView)
        listView.adapter = BaseListAdapter<String>(list, this)
    }
}