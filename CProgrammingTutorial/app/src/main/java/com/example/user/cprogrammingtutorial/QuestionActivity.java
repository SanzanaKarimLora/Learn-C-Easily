package com.example.user.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    private ExpandableListView FAQexpandableListView;
    private CustomAdapter customAdaptar;
    List<String> listHaederData;
    HashMap<String, List<String>> listChildData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        prepareListData();

        FAQexpandableListView = (ExpandableListView) findViewById(R.id.eplvid);

        customAdaptar = new CustomAdapter(this, listHaederData, listChildData);
        FAQexpandableListView.setAdapter(customAdaptar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void prepareListData(){
        String[] headerData = getResources().getStringArray(R.array.FAQ_header);
        String[] childData = getResources().getStringArray(R.array.FAQ_child);

        listHaederData = new ArrayList<>();
        listChildData = new HashMap<>();

        for(int i=0; i<headerData.length; i++){
            //adding header data
            listHaederData.add(headerData[i]);

            List<String> child = new ArrayList<>();
            child.add(childData[i]);

            listChildData.put(listHaederData.get(i),child);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
