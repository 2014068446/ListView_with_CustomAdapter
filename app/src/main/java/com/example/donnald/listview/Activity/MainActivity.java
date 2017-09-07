package com.example.donnald.listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.donnald.listview.Adapter.CustomAdapter;
import com.example.donnald.listview.Model.College;
import com.example.donnald.listview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] colleges;
    String[] year;
    ListView lv_colleges;
    CustomAdapter adapter;
    List<College> listcollege;
    int[] logos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_colleges = (ListView) findViewById(R.id.lvColleges);
        listcollege = new ArrayList<College>();
        colleges = getResources().getStringArray(R.array.Colleges);
        year = getResources().getStringArray(R.array.Year);
        logos = new int[] {
                R.drawable.cat,
                R.drawable.deer,
                R.drawable.dog,
                R.drawable.elephat,
                R.drawable.monkey,};
        for (int i = 0; i < colleges.length; i++) {
            listcollege.add(new College(logos[i], colleges[i], year[i]));
        }
        adapter = new CustomAdapter(this, listcollege);
        lv_colleges.setAdapter(adapter);
        lv_colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "You clicked " + colleges[position];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
