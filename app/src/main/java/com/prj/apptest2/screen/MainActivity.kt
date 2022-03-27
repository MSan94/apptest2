package com.prj.apptest2.screen

import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.prj.apptest2.R
import com.prj.apptest2.databinding.ActivityMainBinding
import com.prj.apptest2.screen.base.BaseActivity
import com.prj.apptest2.screen.contract.MainContract

class MainActivity : BaseActivity(), MainContract.View {


    override fun isToolBar(): Boolean {
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("메인페이지")
    }


}