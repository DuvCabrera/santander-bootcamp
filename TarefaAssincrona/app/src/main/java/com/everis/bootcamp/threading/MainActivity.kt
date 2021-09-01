package com.everis.bootcamp.threading

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_load_data.setOnClickListener {
            launchAstrosTask()
        }
    }

    fun showData(list: List<AstrosPeople>?){
        textview_data.text = ""
        list?.forEach{ people ->
            textview_data.append("${people.name} - ${people.craft} \n\n")
        }
    }


    fun showLoadIndicator() {
        progressbar_load_indicator.visibility = View.VISIBLE
    }

    fun hideLoadIndicator(){
        progressbar_load_indicator.visibility = View.GONE
    }


    fun launchAstrosTask() {
        val task = TaskAstros()
        task.execute()
    }


    inner class TaskAstros() : AsyncTask<Void, Int, List<AstrosPeople>>(){
        private val repository = AstrosRepository()


        override fun onPreExecute() {
            super.onPreExecute()
            showLoadIndicator()
        }

        override fun doInBackground(vararg params: Void?): List<AstrosPeople>? {
            return repository.loadData()
        }

        override fun onPostExecute(result: List<AstrosPeople>?) {
            super.onPostExecute(result)
            hideLoadIndicator()
            showData(result)
        }
    }

}
