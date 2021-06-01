package com.devenicio.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    // esse metodo ira inflar meu menu no app
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // esse metodo ira fazer alguma ação quando meu item for clicad0
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.item_1 -> {
                Log.d("CLICK", "Clicou no botao 1")
                true
            }
            else -> {
                onOptionsItemSelected(item)
            }

        }
    }
}

