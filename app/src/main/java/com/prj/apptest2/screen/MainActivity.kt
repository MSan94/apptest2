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
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.prj.apptest2.R
import com.prj.apptest2.databinding.ActivityMainBinding
import com.prj.apptest2.screen.base.BaseActivity
import com.prj.apptest2.screen.contract.MainContract

class MainActivity : BaseActivity(), MainContract.View {

    val optionList = listOf("메뉴선택","메뉴1","메뉴2","메뉴3","메뉴4")
    private lateinit var sOption : Spinner
    private lateinit var tvItem : TextView

    private lateinit var adapter : ArrayAdapter<Any>

    override fun isToolBar(): Boolean {
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("메인페이지")
        init()
    }

    private fun init(){
        sOption = findViewById<Spinner>(R.id.sOption)
        tvItem = findViewById<TextView>(R.id.tvItem)
        adapter = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,optionList)

        sOption.adapter = adapter
        sOption.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, postion: Int, p3: Long) {
                if(postion != 0){
                    tvItem.text = optionList[postion]
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }


}