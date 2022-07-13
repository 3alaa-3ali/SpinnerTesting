package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add: Button = findViewById(R.id.rs)
        val result: TextView = findViewById(R.id.result)
        val spin: Spinner = findViewById(R.id.spinner)
        var flag : String = "signIn"
        var options = arrayOf("signIn","signUp")
        spin.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )

        add.setOnClickListener { view ->
            if(flag=="signIn")
                result.text = "Signed In Successfully";
            else
                result.text="Signed Up Successfully";
        }
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag=options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}