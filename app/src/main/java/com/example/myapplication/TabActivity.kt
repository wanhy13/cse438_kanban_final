package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.adapter.AccountPagerAdapter
import com.example.myapplication.adapter.TabPagerAdapter
import kotlinx.android.synthetic.main.activity_account.*

class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        val adapter = TabPagerAdapter(this, supportFragmentManager)

        viewpager.adapter = adapter
        tabs.setupWithViewPager(viewpager)
    }

    override fun onBackPressed() {
        // "Close" app (push to background), don't go back to the MainActivity
        finishAffinity()
    }
}
