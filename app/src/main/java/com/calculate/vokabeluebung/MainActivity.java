package com.calculate.vokabeluebung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public String FILENAME = "vokabel.csv";
    public Map<String, List> germankey = new HashMap();
    public Map<String, List> englishkey = new HashMap();
    public List<String> languages = new ArrayList<>();
    public ListView listView;
    public Spinner languagespin;
    public ArrayAdapter adapterList;
    public SpinnerAdapter adapterSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languages.add("Deutsch-Englisch");
        languages.add("Englisch-Deutsch");

        listView = findViewById(R.id.listView);
        languagespin = findViewById(R.id.spinner);
        initcombo(languagespin);

        languagespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    convertToList(listView, germankey);
                }else if(position == 1){
                    convertToList(listView, germankey);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initcombo(Spinner spinner){
        adapterSpinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        spinner.setAdapter(adapterSpinner);
    }

    private void bindAdapterToListView(ListView lv, List convertedList){
        adapterList = new ArrayAdapter(this, android.R.layout.simple_list_item_1, convertedList);
        lv.setAdapter(adapterList);
    }

    public void convertToList(ListView listView, Map germankey){

    }
}
