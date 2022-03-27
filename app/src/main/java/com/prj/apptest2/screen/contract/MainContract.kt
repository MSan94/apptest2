package com.prj.apptest2.screen.contract

import com.prj.apptest2.screen.base.BasePresenter
import com.prj.apptest2.screen.base.BaseView

interface MainContract {

    interface View : BaseView<Presenter>{

    }

    interface Presenter : BasePresenter{

    }

}