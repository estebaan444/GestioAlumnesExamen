package com.estebi.examenandroid

import AlumneProvider.Companion.alumneList
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnEntrar: Button = findViewById(R.id.button2)
        val admintxt: EditText = findViewById(R.id.editTextTextPersonName)
        val admin = "Esteban"
        btnEntrar.setOnClickListener {
            if (admintxt.getText().toString() == admin){
                val intent = Intent(this, CreateUser::class.java)
                startActivity(intent)
            }else{
                alert()
            }
        }
    }
    fun alert(){
        val builder = AlertDialog.Builder(this)
        with(builder)
        {
            setTitle("Nom Admin incorrecte torna-ho a intentar")
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener { dialog, id ->

                    })
            show()
        }
    }
}