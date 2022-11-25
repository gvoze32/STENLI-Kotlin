package com.example.stenli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.stenli.danadarurat.DanadaruratFragment
import com.example.stenli.keluarbulanan.KeluarbulananFragment
import com.example.stenli.lamanabung.LamanabungFragment
import com.example.stenli.rekomenbatas.RekomenbatasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnBulan1: ImageView
    private lateinit var btnDD2 : ImageView
    private lateinit var btnBatas3 : ImageView
    private lateinit var btnNabung4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        supportActionBar?.hide()

        btnBulan1 = findViewById(R.id.btn_keluarbulanan)
        btnDD2 = findViewById(R.id.btn_danadarurat)
        btnBatas3 = findViewById(R.id.btn_rekomenbatas)
        btnNabung4 = findViewById(R.id.btn_lamanabung)

        btnBulan1.setOnClickListener{
            loadFragment(KeluarbulananFragment())
        }

        btnDD2.setOnClickListener{
            loadFragment(DanadaruratFragment())
        }

        btnBatas3.setOnClickListener{
            loadFragment(RekomenbatasFragment())
        }

        btnNabung4.setOnClickListener{
            loadFragment(LamanabungFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}