package com.iz.appcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // 0.n 1.+ 2.- 3.* 4./
    var oper: Int = 0
    var rnum1: Double = 0.0
    var num2t: Double = 0.0
    lateinit var tvNum1: TextView
    lateinit var tvNum2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNum1= findViewById(R.id.tvNum1)
        tvNum2= findViewById(R.id.tvNum2)

        val btnct: Button= findViewById(R.id.btnc)
        val btnit: Button= findViewById(R.id.btni)

        btnit.setOnClickListener {
            var rnum2: Double= tvNum2.text.toString().toDouble()
            var result: Double = 0.0

            when(oper){
                1 -> result = rnum1 + rnum2
                2 -> result = rnum1 - rnum2
                3 -> result = rnum1 * rnum2
                4 -> result = rnum1 / rnum2
            }
            tvNum2.setText(result.toString())
            tvNum1.setText("")
        }
        btnct.setOnClickListener {
            rnum1 = 0.0
            tvNum1.setText("$rnum1")
            tvNum2.setText("$rnum1")
            //rnum1 = 0.0
            oper = 0
        }

    }
    fun ckDigito(view: View){
        //val tvNum2:TextView=findViewById(R.id.tvNum2)
        //var num2t: Double = 0.0
        num2t = tvNum2.text.toString().toDouble()
        var num2: String = tvNum2.text.toString()
        //num2t=num2t+1.0


        when(view.id){
            R.id.btn0 -> {
                num2t=num2t+0.0
                tvNum2.setText("$num2t")
            }
            R.id.btn1 -> {
                num2t=num2t+1.0
                tvNum2.setText("$num2t")
            }
            R.id.btn2 -> {
                num2t=num2t+2.0
                tvNum2.setText("$num2t")
            }
            R.id.btn3 -> {
                num2t=num2t+3.0
                tvNum2.setText("$num2t")
            }
            R.id.btn4 -> {
                num2t=num2t+4.0
                tvNum2.setText("$num2t")
            }
            R.id.btn5 -> {
                num2t=num2t+5.0
                tvNum2.setText("$num2t")
            }
            R.id.btn6 -> {
                num2t=num2t+6.0
                tvNum2.setText("$num2t")
            }
            R.id.btn7 -> {
                num2t=num2t+7.0
                tvNum2.setText("$num2t")
            }
            R.id.btn8 -> {
                num2t=num2t+8.0
                tvNum2.setText("$num2t")
            }
            R.id.btn9 -> {
                num2t=num2t+9.0
                tvNum2.setText("$num2t")
            }
            R.id.btnp -> {
                num2t=num2t+0.0
                tvNum2.setText("$num2t")
            }

        }
    }
    fun ckOperacion(view: View){
        rnum1 = tvNum2.text.toString().toDouble()
        var tvNum2txt: String = tvNum2.text.toString()
        tvNum2.setText("0.0")
        when(view.id){
            R.id.btns ->{
                tvNum1.setText(tvNum2txt + "+")
                oper = 1
            }
            R.id.btnr ->{
                tvNum1.setText(tvNum2txt + "-")
                oper = 2
            }
            R.id.btnm ->{
                tvNum1.setText(tvNum2txt + "*")
                oper = 3
            }
            R.id.btnd ->{
                tvNum1.setText(tvNum2txt + "/")
                oper = 4
            }
        }
    }
}