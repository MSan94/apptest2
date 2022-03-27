package com.prj.apptest2.screen.base

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.prj.apptest2.R
import com.prj.apptest2.databinding.ActivityBaseBinding
import com.prj.apptest2.screen.MenuActivity

abstract class BaseActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBaseBinding.inflate(layoutInflater) }
    lateinit var fullView : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }


    override fun setContentView(layoutId : Int) {
        fullView = layoutInflater.inflate(R.layout.activity_base,null) as LinearLayout
        val activityContainer = fullView.findViewById<FrameLayout>(R.id.layoutActivity)
        layoutInflater.inflate(layoutId,activityContainer,true)
        super.setContentView(fullView)

        var layoutMenu = fullView.findViewById<ConstraintLayout>(R.id.layoutMenu)
        var ivMenu = fullView.findViewById<ImageView>(R.id.ivMenu)

        if(!isToolBar()){ layoutMenu.visibility = View.GONE } // 툴바 설정

    }


    /**
     * 툴바 사용 여부
     */
    abstract fun isToolBar(): Boolean


    fun setTitle(title : String) {
        val tvTitle = fullView.findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = title
    }

    private fun init(){
    }

}