package com.example.calculadoraconsumodiarioaguamat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoraconsumodiarioaguamat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener { view ->
            val quilos = binding.etPeso.text.toString().replace(",", ".").toDouble()
            val litros = quilos * 0.035
            val litrosFormatado = "%.3f".format(litros).replace(".", ",")
            binding.tvResultado.text = "Você precisa ingerir " +
                    "$litrosFormatado litro(s) de água por dia."
        }
    }
}