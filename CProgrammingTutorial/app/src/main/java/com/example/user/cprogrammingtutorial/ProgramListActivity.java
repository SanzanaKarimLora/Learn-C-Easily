package com.example.user.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProgramListActivity extends AppCompatActivity {

    private ListView listViewProgramList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listViewProgramList = (ListView)findViewById(R.id.lvid);
        final String[] name = getResources().getStringArray(R.array.program_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProgramListActivity.this,R.layout.program_list_sample,R.id.textViewSampleID,name);
        listViewProgramList.setAdapter(adapter);


        listViewProgramList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = name[position];
                Intent program_intent = new Intent(ProgramListActivity.this,ProgramShowActivity.class);
                program_intent.putExtra("program_name", value);
                startActivity(program_intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
