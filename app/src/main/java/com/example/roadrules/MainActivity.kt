package com.example.roadrules

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val infoCheckBox: CheckBox = findViewById(R.id.checkbox_info)
        val infoTextView: TextView = findViewById(R.id.info_text)
        val rulesTextView: TextView = findViewById(R.id.rules_text)

        infoCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                infoTextView.text = "Правила дорожного движения"
                rulesTextView.text = """
                    1. Проезд на красный свет светофора запрещен
                    2. Движение задним ходом на автомагистрали запрещено
                    3. Движение без дневных ходовых огней в светлое время суток запрещено
                """.trimIndent()
            } else {
                infoTextView.text = ""
                rulesTextView.text = ""
            }
        }
    }
}
