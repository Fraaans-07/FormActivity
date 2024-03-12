package com.example.formactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView // tambahkan import ini

class DisplayActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Mendapatkan intent yang dikirim dari MainActivity
        val intent = intent
        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val prodi = intent.getStringExtra("prodi")
        val jk = intent.getStringExtra("jk")
        val alamat = intent.getStringExtra("alamat")

        // Inisialisasi TextView
        val textViewNama = findViewById<TextView>(R.id.textViewNama)
        val textViewNim = findViewById<TextView>(R.id.textViewNIM)
        val textViewProdi = findViewById<TextView>(R.id.textViewProdi)
        val textViewJK = findViewById<TextView>(R.id.textViewJK)
        val textViewAlamat = findViewById<TextView>(R.id.textViewAlamat)

        // Set nilai pada TextView
        textViewNama.text = "Nama: $nama"
        textViewNim.text = "NIM: $nim"
        textViewProdi.text = "Program Studi: $prodi"
        textViewJK.text = "Jenis Kelamin: $jk"
        textViewAlamat.text = "Alamat: $alamat"
    }
}
