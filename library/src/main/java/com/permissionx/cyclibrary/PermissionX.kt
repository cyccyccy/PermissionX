package com.permissionx.cyclibrary

import androidx.fragment.app.FragmentActivity

object PermissionX {
    private const val TGA = "InvisibleFragment"
    fun request(activity: FragmentActivity,vararg permissions: String,callback: PermissionCallback){
        val fragmentManager = activity.supportFragmentManager
        val existedFragment = fragmentManager.findFragmentByTag(TGA)
        val fragment = if (existedFragment != null){
            existedFragment as InvisibleFragment
        }else{
            val invisibleFragment = InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TGA).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback,*permissions)
    }
}