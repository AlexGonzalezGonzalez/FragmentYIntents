package com.ajgg.app1.managerfragments

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            //id_Horizontal es un boton que solo esta en el layout horizontal, si es null esta en portrait
            if (id_horizontal != null) {
                //Cargamos el fragment si esta en horizontal

                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragment, detalle.newInstance(), "RageComicList")
                        .commit()

            } else {
                //Si esta en portrait le damos un listener al boton creador para que haga intents
                bCreador.setOnClickListener { view ->
                val intent = Intent(this, Activity2::class.java).apply {
                    putExtra("id", 5)
                }
                startActivity(intent)
            }
        }


    }
}

