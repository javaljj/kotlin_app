package com.javalj.kotlinapp.ui.setting

import android.os.Bundle
import android.view.MenuItem
import com.javalj.kotlinapp.R

import com.javalj.kotlinapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.common_toolbar.*

/**
 * Created by lijie on 2016/2/11.
 */
class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.title = "xxx"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> this.finish()
        }

        return super.onOptionsItemSelected(item)
    }
}