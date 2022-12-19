package com.estebi.examenandroid

import AlumneProvider.Companion.alumneList
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel
import kotlinx.coroutines.NonCancellable.start

class CreateUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        val btnListOfAlum: Button = findViewById(R.id.llistat)
        val btnAfegitUser: Button = findViewById(R.id.afegir)

        btnAfegitUser.setOnClickListener {
            dialeg()
        }
        btnListOfAlum.setOnClickListener {
            val intent = Intent(this, NavFrag::class.java)
            startActivity(intent)
        }
    }
    fun dialeg(){
        val nomLabel: EditText = findViewById(R.id.nom)
        val edadLabel: EditText = findViewById(R.id.Edat)
        val descLabel: EditText = findViewById(R.id.informe)
        val builder = AlertDialog.Builder(this)
        with(builder)
        {
            setTitle("Segur que vols introduir un nou alumne?")
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener { dialog, id ->
                        alumneList.addAll(listOf(Alumne(nomLabel.getText().toString(),  edadLabel.getText().toString(), descLabel.getText().toString())))

                    })
                .setNegativeButton("CANCEL",
                    DialogInterface.OnClickListener { dialog, id ->
                    })
            show()
        }
    }

}