package com.duv.calc_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class relative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)
    }
    override fun onStart() {
        super.onStart()
        Log.w("lifcycle", "entrei no START - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifcycle", "entrei no RESUME - agora você pode Interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifcycle", "PAUSE - a tela perdeu o coco, você não pode mais Interagir")
    }

    override fun onStop() {
        Log.w("lifcycle", "STOP - a tela não está mais visivel mas ainda existe")
        super.onStop()
    }

    override fun onDestroy() {
        Log.w("lifcycle", "\n entrei no DESTROY - oh não! a tela foi destruída")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifcycle", "\nentrei no RESTART - a tela esta retomando o foco")

    }
}