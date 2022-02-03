package com.deasdaniel.bookproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameEditText : EditText = findViewById(R.id.Edit_name_text_view)
        var saveButton : Button = findViewById(R.id.save_button)
        var infoTextView : TextView = findViewById(R.id.info_text_view)
        var yearEditText : EditText = findViewById(R.id.Year_edit_text)
        var info2TextView: TextView = findViewById(R.id.text_year_info)


        saveButton.setOnClickListener {

            var nameText : String = nameEditText.text.toString()
            infoTextView.text = nameText
            var yearText : String = yearEditText.text.toString()
            info2TextView.text = yearText



        }


    }
}

fun newInstance(): {
    val args = Bundle()
    
    val fragment = ()
    fragment.arguments = args
    return fragment
}