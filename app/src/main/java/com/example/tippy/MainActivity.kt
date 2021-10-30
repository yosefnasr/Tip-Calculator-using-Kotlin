package com.example.tippy

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.DragEvent
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.View.DragShadowBuilder
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

import android.widget.RelativeLayout
import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity


private const val TAG = "MainActivity"
private const val INITIAL_TIP_PERCENT = 15
private const val IMAGEVIEW_TAG = "icon bitmap"

class MainActivity : AppCompatActivity() {
    var chessModel = ChessModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "$chessModel")
    }
}
