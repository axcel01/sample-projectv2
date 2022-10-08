package com.example.mysample.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mysample.main.firstfragment.FirstFragment

class MainViewModel: ViewModel(){
    val navigation = MutableLiveData<FragmentNavigation>()

   fun navigateToFirst(){
       navigation.value = FragmentNavigation.FirstFragment
   }
    fun navigateToSecond(){
        navigation.value = FragmentNavigation.SecondFragment
    }
}