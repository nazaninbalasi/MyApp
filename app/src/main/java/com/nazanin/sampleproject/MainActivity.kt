package com.nazanin.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //new line
        var numArray = ArrayList<Int>()
        numArray.add(21)
        numArray.add(10)
        numArray.add(243)
        numArray.add(43)
        numArray.add(5)
        numArray.add(65)
        numArray.add(123)
        numArray.add(325)
        numArray.add(658)
        numArray.add(201)
        numArray.add(365)
        numArray.add(2)
        numArray.add(123)
        numArray.add(145)
        numArray.add(178)
        numArray.add(36)
        numArray.add(89)
        numArray.add(28)
        numArray.add(1)
        numArray.add(35)
        numArray.add(75)
        numArray.add(65)
        numArray.add(98)
        numArray.add(45)
        numArray.add(104)
        numArray.add(3)
        numArray.add(63)
        sort(numArray, 0, numArray.size - 1)
    }

    fun sort(numbers: ArrayList<Int>, low: Int, hiegh: Int): ArrayList<Int> {
        var sortArray = numbers
        var j : Int = hiegh
        var pivot : Int = numbers[hiegh]
        var i : Int = low -1

        for (b in 0..j){
            if (numbers[b] <= pivot){
                i++
                numbers[j] = b.also { j = b }
            }
        }






        return sortArray
    }

}