package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.text.FieldPosition

class MyCustomAdapter(val ctx: Context, val myDataList: List<MyData>): BaseAdapter() {
    override fun getCount(): Int {
        return myDataList.size
    }

    override fun getItem(p0: Int): MyData {
        return myDataList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myConvertView = convertView
        if(myConvertView == null){
            myConvertView = LayoutInflater.from(ctx).inflate(R.layout.my_list_item, parent, false)
        }


        val currentItem = getItem(position)

        val titleItem = myConvertView?.findViewById<TextView>(R.id.list_item_name)

        titleItem?.text = currentItem.title

        return myConvertView!!
    }

}