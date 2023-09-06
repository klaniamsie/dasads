package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListData= mutableListOf<MyData>()

        myListData.add(MyData("Przepis1", "JAJA KURZE I MLEKO"))
        myListData.add(MyData("Przepis2", "JAJA KURZE I MLEKO"))
        myListData.add(MyData("Przepis3", "JAJA KURZE I MLEKO"))
        myListData.add(MyData("Przepis4", "JAJA KURZE I MLEKO"))
        myListData.add(MyData("Przepis5", "JAJA KURZE I MLEKO"))

        val myListView = findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = MyCustomAdapter(this, myListData)

    }
}