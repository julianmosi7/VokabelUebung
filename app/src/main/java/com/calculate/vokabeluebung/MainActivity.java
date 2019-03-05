package com.calculate.vokabeluebung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public String FILENAME = "vokabel.csv";
    public Map<String, List> germankey = new HashMap();
    public Map<String, List> englishkey = new HashMap();
    public ListView view;
    public Spinner languagespin;
    public BaseAdapter adapterList;
    public SpinnerAdapter adapterSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.listView);
        languagespin = findViewById(R.id.spinner);
        initcombo(languagespin);

        languagespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){

                }else if(position == 1){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initcombo(Spinner spinner){
        spinner.setAdapter(adapterSpinner);
    }

    private void bindAdapterToListView(ListView lv, Map map){
        adapterList = new HashMapBaseAdapter();
    }
}
