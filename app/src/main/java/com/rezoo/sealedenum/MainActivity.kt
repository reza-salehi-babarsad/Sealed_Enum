package com.rezoo.sealedenum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val error:HttpError=HttpError.NotFound
        when(error){
            HttpError.NotFound -> Unit
            HttpError.Unauthorized -> Unit
        }

        val errorEnum:HttpErrorEnum = HttpErrorEnum.NotFound
        when(errorEnum){
            HttpErrorEnum.Unauthorized -> TODO()
            HttpErrorEnum.NotFound -> TODO()
        }

    }
}