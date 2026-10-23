package com.example.ktgk_2415053122311_nguyenthaikyduyen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.*

const val tieuDe_311= "NguyenThaiKyDuyen - 2415053122311 - QLCTCN"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = tieuDe_311
        val edtTen_311 = findViewById<EditText>(R.id.edtTen_311)
        findViewById<Button>(R.id.btnThem_311).setOnClickListener {
            Toast.makeText(this, if (edtTen_311.text.isBlank()) "Nhap ten" else "Da them", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnXem_311).setOnClickListener {
            startActivity(Intent(this, ChiTietChiTieuActivity::class.java))
        }
    }
}