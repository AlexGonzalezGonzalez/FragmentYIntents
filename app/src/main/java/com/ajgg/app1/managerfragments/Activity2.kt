package com.ajgg.app1.managerfragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.fragment_detalle.*

import org.jetbrains.anko.toast


class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        //Activity que solo muestra un toast
        val intentRec=intent
        val valor:Int=intentRec.extras.getInt("id")
        txt.text= valor.toString()

        }
    }

