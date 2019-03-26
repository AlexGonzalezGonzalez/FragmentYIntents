package com.ajgg.app1.managerfragments

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            if (id_horizontal != null) {


                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragment, detalle.newInstance(), "RageComicList")
                        .commit()

            } else {
                bCreador.setOnClickListener { view ->
                val intent = Intent(this, Activity2::class.java).apply {
                    putExtra("id", 5)
                }
                startActivity(intent)
            }
        }


    }
}

