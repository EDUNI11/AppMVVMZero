package com.enaitzdam.appmvvmzero

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    fun countedStudents(age: Int) : Int {
        return StudentProvider.countAgeStudents(age)
    }
}