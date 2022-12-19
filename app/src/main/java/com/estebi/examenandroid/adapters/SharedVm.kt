package com.estebi.examenandroid.adapters

import androidx.lifecycle.ViewModel

class SharedVm : ViewModel() {
    companion object{
        val listOfNames: ArrayList<String> = ArrayList()
        val listOfAges: ArrayList<String> = ArrayList()
    }
}