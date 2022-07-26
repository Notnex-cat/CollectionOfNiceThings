package com.example.collectionofnicethings

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_Black_NoTitleBar_Fullscreen)
        setContentView(R.layout.activity_ball)

        var ans = findViewById<TextView>(R.id.future)
        val btn = findViewById<Button>(R.id.button)

        var answers = arrayOf(
            "Попей говна",
            "Мои " + "\n" + "источники" + "\n" + "говорят нет",
            "Мои " + "\n" + "источники" + "\n" + "говорят да",
            "Не знаю",
            "50/50",
            "Может быть",
            "Конечно",
            "Не сейчас",
            "Спроси снова",
            "Очень" + "\n" + "сомневаюсь",
            "Не могу" + "\n" + "сейчас" + "\n" + "сказать",
            "Я" + "\n" + "сомневаюсь" + "\n" + "на счет" + "\n" + "этого",
            "Думаю," + "\n" + "не стоит"
        )

        btn.setOnClickListener {
            val rnd = (0..12).random()
            ans.text = answers[rnd]
        }
    }
}



