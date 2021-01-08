package com.example.picasoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    var uriImage: EditText? = null
    var myImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImage = findViewById(R.id.myImage)
        uriImage = findViewById(R.id.uriImage)

    }

    fun onClickLoadImage(view: View) {

        val mUrl = uriImage!!.text.toString()

        if(!TextUtils.isEmpty(mUrl)) {
            //Picasso.get().load("http://i.imgur.com/DvpvklR.png")
            Picasso.get().load(mUrl)
                .error(R.drawable.ic_launcher_background)
                .into(myImage)
        }
        else {
            Toast.makeText(this,"Не задан адрес картинки.",Toast.LENGTH_LONG)
        }

    }


}