package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvEnlaces;
    String[] enlaces = {"www.google.es", "developer.android.com", "www.idealista.com", "fpdistancia.educa.madrid.org"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEnlaces = (ListView) findViewById(R.id.lvEnlaces);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, enlaces);
        lvEnlaces.setAdapter(adaptador);

        lvEnlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String enlace = (String) adaptador.getItem(position);
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("enlace", enlace);
                startActivity(i);

            }
        });

    }
}