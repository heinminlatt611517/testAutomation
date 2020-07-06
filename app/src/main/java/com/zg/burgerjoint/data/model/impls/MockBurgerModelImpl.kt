package com.zg.burgerjoint.data.model.impls

import androidx.lifecycle.LiveData
import com.zg.burgerjoint.data.model.BurgerModel
import com.zg.burgerjoint.data.vos.BurgerVO

object MockBurgerModelImpl : BurgerModel {
    override fun getAllBurgers(): LiveData<List<BurgerVO>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findBurgerById(burgerId: Int): LiveData<BurgerVO> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBurgersInCart(): LiveData<List<BurgerVO>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeItemFromCart(burger: BurgerVO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addItemToCart(burger: BurgerVO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun aa(){

    }
}