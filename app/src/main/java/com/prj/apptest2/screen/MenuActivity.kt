package com.prj.apptest2.screen

import android.os.Bundle
import com.prj.apptest2.R
import com.prj.apptest2.screen.base.BaseActivity

class MenuActivity : BaseActivity() {
    override fun isToolBar(): Boolean {
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
}