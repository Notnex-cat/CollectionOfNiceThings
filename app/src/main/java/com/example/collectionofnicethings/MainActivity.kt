package com.example.collectionofnicethings

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>

        val users = arrayOf(

            "Шар предсказаний", "белый пушистый котек", "уродливый лысый кот",

            "ещё один пушистый котек", "кися"
        )

        // доступ к listView из файла XML

        var mListView = findViewById<ListView>(R.id.userlist)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, i, id ->

            //Toast.makeText(this, "Clicked item :"+" "+ i, Toast.LENGTH_SHORT).show()
            when (i) {
                0 -> startActivity(Intent(this@MainActivity, BallActivity::class.java))
            }
        }
    }
}