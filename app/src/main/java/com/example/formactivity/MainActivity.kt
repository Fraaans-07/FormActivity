package com.example.formactivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Button
import android.widget.RadioButton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNama = findViewById<EditText>(R.id.editTextNama)
        val editTextNIM = findViewById<EditText>(R.id.editTextNIM)
        val radioGroupProdi = findViewById<RadioGroup>(R.id.radioGroupProdi)
        val radioGroupJK = findViewById<RadioGroup>(R.id.radioGroupJK)
        val editTextAlamat = findViewById<EditText>(R.id.editTextAlamat)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val nama = editTextNama.text.toString()
            val nim = editTextNIM.text.toString()
            val selectedProdi = findViewById<RadioButton>(radioGroupProdi.checkedRadioButtonId).text.toString()
            val selectedJK = findViewById<RadioButton>(radioGroupJK.checkedRadioButtonId).text.toString()
            val alamat = editTextAlamat.text.toString()

            // Membuat Intent untuk memulai DisplayActivity dan mengirimkan data
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("nim", nim)
            intent.putExtra("prodi", selectedProdi)
            intent.putExtra("jk", selectedJK)
            intent.putExtra("alamat", alamat)

            // Memulai DisplayActivity dengan data yang dikirimkan
            startActivity(intent)
        }
    }
}