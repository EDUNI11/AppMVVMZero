package com.enaitzdam.appmvvmzero

class StudentProvider {
    companion object {
        fun countAgeStudents(age: Int): Int {
            return students.count {
                it.age == age
            }
        }

        private val students = listOf(
            StudentModel(
                name = "Edu Nievas",
                age = 20
            ),
            StudentModel(
                name = "Edu",
                age = 20
            ),
            StudentModel(
                name = "Nievas",
                age = 20
            ),
            StudentModel(
                name = "Edu Nievas 21",
                age = 21
            ),
            StudentModel(
                name = "Nievas 21",
                age = 21
            ),
            StudentModel(
                name = "21",
                age = 21
            ),
            StudentModel(
                name = "23",
                age = 21
            ),
        )
    }
}

