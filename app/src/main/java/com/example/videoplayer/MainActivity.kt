package com.example.videoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ADpter view
        var listview :ListView=findViewById(R.id.Listview)
        val Datasource = arrayOf("Brazil","Zermany","Argentina")
        val arrayAdapter :ArrayAdapter<*>

        arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,Datasource)
        listview.adapter=arrayAdapter


    }
}