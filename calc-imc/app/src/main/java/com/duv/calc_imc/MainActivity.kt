package com.duv.calc_imc

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.duv.calc_imc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setListeners()
    }

    private fun setListeners() {
        binding.alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        binding.pesoEDT.doOnTextChanged{ text, _, _, _ ->
            binding.titleTXT?.text = text
        }
        binding.calcBTN.setOnClickListener {
            calculaIMC(binding.pesoEDT.text.toString(), binding.alturaEDT.text.toString())
        }
    }

    private fun calculaIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            binding.titleTXT.text = "O seu IMC é de {%.2f}".format(imc)
        }
    }
}



