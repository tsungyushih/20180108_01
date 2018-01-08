package com.example.student.a20180108_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act=findViewById(R.id.autoCompleteTextView);
        String str[]={"aaaa","aaab","aabt","abcd"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,str);
        act.setThreshold(1);    //第幾個字就彈出自動文字
        act.setAdapter(adapter);



    }

    public void clickhashmap(View v)
    {
        TextView tv=findViewById(R.id.textView);

        HashMap m1=new HashMap();
        HashMap m2=new HashMap();
        m1.put("name","frank");
        m2.put("name","bomb");
        ArrayList<Map> mylist=new ArrayList<Map>();
        mylist.add(m1);
        mylist.add(m2);
        for(Map m:mylist)
        {
            m.get("name");

        }
        String[]s1=new String[]{"name"};
        tv.setText(s1.toString());
    }
}
