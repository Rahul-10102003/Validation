package com.example .validation

import com.example.validation.R

import android.content.DialogInterface.OnClickListener
import android.content.Intent
import android.graphics.PointF.length
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Checkable
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.validation.MainActivity2
import com.example.validation.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var et1:TextInputLayout
    lateinit var et2:TextInputEditText
    lateinit var et3:TextInputEditText
    lateinit var et4:TextInputEditText
    lateinit var et5:TextInputEditText
    fun check():Boolean{
        if(et1.editText?.text?.length==0){
            return false
        }
        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn.setOnClickListener(){
            if(check()){
            var submit=Intent(Intent(this,MainActivity2::class.java))
            startActivity(submit)}
        }

    }




}