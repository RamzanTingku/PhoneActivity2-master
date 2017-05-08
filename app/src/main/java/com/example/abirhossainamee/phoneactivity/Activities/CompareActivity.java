package com.example.abirhossainamee.phoneactivity.Activities;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.abirhossainamee.phoneactivity.ActivityAdapter.CompareAdapter;
import com.example.abirhossainamee.phoneactivity.ModelClass.InfoClass;
import com.example.abirhossainamee.phoneactivity.R;

import java.util.ArrayList;

public class CompareActivity extends AppCompatActivity {


    private Toolbar mtoolbar;
    ArrayList<InfoClass> dailyInfo, weeklyInfo, monthlyInfo;
    public RecyclerView recyclerView;
    public CompareAdapter compareAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.compare_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        getDaily();
        getWeekly();
        getMonthly();
        compareAdapter = new CompareAdapter(this, dailyInfo);
        recyclerView.setAdapter(compareAdapter);


        setSupportActionBar(mtoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    public void getDaily(){
        dailyInfo = new ArrayList<>();
        for (int i = 1; i <=20; i++){
            InfoClass info = new InfoClass("Day "+i, i, i, i);
            dailyInfo.add(info);
        }

    }

    public void getWeekly(){
        weeklyInfo = new ArrayList<>();
        for (int i = 1; i <=20; i++){
            InfoClass info = new InfoClass("Week "+i, i, i, i);
            weeklyInfo.add(info);
        }

    }

    public void getMonthly(){
        monthlyInfo = new ArrayList<>();
        for (int i = 1; i <=20; i++){
            InfoClass info = new InfoClass("Month "+i, i, i, i);
            monthlyInfo.add(info);
        }

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) MenuItemCompat.getActionView(item);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_list_item_array, R.layout.spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
       /* spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        compareAdapter = new CompareAdapter(this, dailyInfo);
                        break;

                    case 1:
                        compareAdapter = new CompareAdapter(this, weeklyInfo);
                        break;

                    case 2:
                        compareAdapter = new CompareAdapter(this, monthlyInfo);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                compareAdapter = new CompareAdapter(this, dailyInfo);

            }
        });

        */
        spinner.setPopupBackgroundResource(R.color.colorPrimary);
        return true;
        }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.spinner) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}




