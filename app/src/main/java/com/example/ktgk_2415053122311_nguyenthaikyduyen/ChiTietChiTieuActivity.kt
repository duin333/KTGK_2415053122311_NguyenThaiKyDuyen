package com.example.ktgk_2415053122311_nguyenthaikyduyen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class ChiTietChiTieuActivity : AppCompatActivity() {
    lateinit var tv_311: TextView
    var ten_311 =""
    var tien_311 = 0L
    var ghi_311 =""
    fun hienThi_311() { tv_311.text = "$ten_311 - $tien_311 - $ghi_311" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chi_tiet_chi_tieu)
        supportActionBar?.title= tieuDe_311
        tv_311 = findViewById(R.id.tv_311)
        findViewById<Button>(R.id.btnVe_311).setOnClickListener { finish() }
        ten_311 = intent.getStringExtra("ten") ?: ""
        tien_311 = intent.getLongExtra("tien", 0L)
        ghi_311 = intent.getStringExtra("ghi") ?: ""
        if (ten_311.isBlank() || tien_311 <= 0L) {tv_311.text = "Thieu ten hoac so tien sai"; return}
        hienThi_311()
    }
}