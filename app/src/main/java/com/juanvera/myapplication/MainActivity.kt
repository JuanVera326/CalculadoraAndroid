package com.juanvera.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var res : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1:Button = findViewById(R.id.button1)
        btn1.setOnClickListener{resultado("1")}

        val btn2:Button = findViewById(R.id.button2)
        btn2.setOnClickListener{resultado("2")}

        val btn3:Button = findViewById(R.id.button3)
        btn3.setOnClickListener{ resultado("3")}

        val btn4:Button = findViewById(R.id.button4)
        btn4.setOnClickListener{resultado("4")}

        val btn5:Button = findViewById(R.id.button5)
        btn5.setOnClickListener{resultado("5")}

        val btn6:Button = findViewById(R.id.button6)
        btn6.setOnClickListener{resultado("6")}

        val btn7:Button = findViewById(R.id.button7)
        btn7.setOnClickListener{resultado("7")}

        val btn8:Button = findViewById(R.id.button8)
        btn8.setOnClickListener{resultado("8")}

        val btn9:Button = findViewById(R.id.button9)
        btn9.setOnClickListener{resultado("9")}

        val btn0:Button = findViewById(R.id.button0)
        btn0.setOnClickListener{resultado("0")}



        val btnSum:Button = findViewById(R.id.buttonSumar)
        btnSum.setOnClickListener{}

        val btnRest:Button = findViewById(R.id.buttonRestar)
        btnRest.setOnClickListener{}

        val btnDiv:Button = findViewById(R.id.buttonDividir)
        btnDiv.setOnClickListener{}

        val btnMultp:Button = findViewById(R.id.buttonMultipli)
        btnMultp.setOnClickListener{}

        val btnComa:Button = findViewById(R.id.buttonComa)
        btnComa.setOnClickListener{}

        val btnBorrar:Button = findViewById(R.id.buttonBorrar)
        btnBorrar.setOnClickListener{}

        val btnBorrarTodo:Button = findViewById(R.id.buttonBorrarTodo)
        btnBorrarTodo.setOnClickListener{}

        val btnIGual:Button = findViewById(R.id.buttonIgual)
        btnIGual.setOnClickListener{}
    }

    private fun resultado (a:String){

    }


    public fun sum (a:Double,b:Double): Double {
        var res:Double = (a + b)
        return res
    }
    public fun rest (a:Double,b:Double): Double {
        var res:Double = (a - b)
        return res
    }
    public fun multp (a:Double,b:Double): Double {
        var res:Double = (a * b)
        return res
    }
    public fun div (a:Double,b:Double): Double {
        var res:Double = (a / b)
        return res
    }


}
