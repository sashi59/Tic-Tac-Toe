package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var flag = 0
   var  count = 0

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }

    fun checkPermission(view: View){


            val currentBtn = view as Button

            if(currentBtn.text=="") {


                count++
                if (flag == 0) {
                    currentBtn.text = "X"

                    flag = 1
                } else {
                    currentBtn.text = "O"
                    flag = 0
                }

                val b1 = binding.btn1.text.toString()
                val b2 = binding.btn2.text.toString()
                val b3 = binding.btn3.text.toString()
                val b4 = binding.btn4.text.toString()
                val b5 = binding.btn5.text.toString()
                val b6 = binding.btn6.text.toString()
                val b7 = binding.btn7.text.toString()
                val b8 = binding.btn8.text.toString()
                val b9 = binding.btn9.text.toString()

                if (b1 == b2 && b2 == b3 && b3 != "") {
                    Toast.makeText(this@MainActivity, "Winner is : $b1", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b4 == b5 && b5 == b6 && b6 != "") {
                    Toast.makeText(this@MainActivity, "Winner is : $b4", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b7 == b8 && b8 == b9 && b9 != "") {
                    Toast.makeText(this@MainActivity, "Winner is : $b7", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b1 == b4 && b4 == b7 && b7 != "") {
                    Toast.makeText(this@MainActivity, "Winneris : $b1", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b2 == b5 && b5 == b8 && b8 != "") {
                    Toast.makeText(this@MainActivity, "Winneris : $b2", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b3 == b6 && b6 == b9 && b9 != "") {
                    Toast.makeText(this@MainActivity, "Winneris : $b3", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b1 == b5 && b5 == b9 && b9 != "") {
                    Toast.makeText(this@MainActivity, "Winneris : $b1", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (b3 == b5 && b5 == b7 && b7 != "") {
                    Toast.makeText(this@MainActivity, "Winneris : $b3", Toast.LENGTH_LONG).show()
                    newMatch()
                } else if (count == 9) {
                    Toast.makeText(this@MainActivity, "Match Drawn", Toast.LENGTH_LONG).show()
                    newMatch()
                }

            }


    }
    fun newMatch() {
        binding.apply {
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
        }

        count = 0
        flag = 0

    }
}