package com.example.collectionofnicethings

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>

        val users = arrayOf(

            "рыжий котек", "белый пушистый котек", "уродливый лысый кот",

            "ещё один пушистый котек", "кися")

        // доступ к listView из файла XML

        var mListView = findViewById<ListView>(R.id.userlist)

        arrayAdapter = ArrayAdapter(this,

            android.R.layout.simple_list_item_1, users)
            //Toast.makeText(applicationContext, "1", Toast.LENGTH_SHORT).show()
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Clicked item :"+" "+position,Toast.LENGTH_SHORT).show()
            getSupportFragmentManager().beginTransaction()
                .add(android.R.id.content, FirstFragment()).commit();}
    }
}