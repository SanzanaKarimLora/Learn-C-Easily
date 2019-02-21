package com.example.user.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TutorialShowActivity extends AppCompatActivity {
    private TextView title_tt;
    private TextView tut_tt;
    private Button playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_show);

        title_tt = (TextView) findViewById(R.id.tutorial_title_Id);
        tut_tt = (TextView) findViewById(R.id.tutorial_text_Id);

        playBtn = (Button) findViewById(R.id.playBtnId);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(TutorialShowActivity.this, VideoPlayActivity.class);
                startActivity(playIntent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle_tut = getIntent().getExtras();

        if(bundle_tut != null){
            String tutName = bundle_tut.getString("tut");
            showTutorialText(tutName);
        }

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void showTutorialText(String TutName){
        String[] childDataTuto = getResources().getStringArray(R.array.tut_child);
        if(TutName.equals("Structure")){
            title_tt.setText("Structure");
            tut_tt.setText(childDataTuto[0]);
        }if(TutName.equals("Union")){
            title_tt.setText("Union");
            tut_tt.setText(childDataTuto[1]);
        }if(TutName.equals("Formatted IO-printf & scanf")){
            title_tt.setText("Formatted IO-printf & scanf");
            tut_tt.setText(childDataTuto[2]);
        }if(TutName.equals("Character IO-getchar & putchar")){
            title_tt.setText("Character IO-getchar & putchar");
            tut_tt.setText(childDataTuto[3]);
        }if(TutName.equals("Blocks and Scope")){
            title_tt.setText("Blocks and Scope");
            tut_tt.setText(childDataTuto[4]);
        }if(TutName.equals("Definition & Declaration")){
            title_tt.setText("Definition & Declaration");
            tut_tt.setText(childDataTuto[5]);
        }if(TutName.equals("Structure of a Program")){
            title_tt.setText("Structure of a Program");
            tut_tt.setText(childDataTuto[6]);
        }if(TutName.equals("Function Basics")){
            title_tt.setText("Function Basics");
            tut_tt.setText(childDataTuto[7]);
        }if(TutName.equals("Definition and Declaration")){
            title_tt.setText("Definition and Declaration");
            tut_tt.setText(childDataTuto[8]);
        }if(TutName.equals("Standard Header Files")){
            title_tt.setText("Standard Header Files");
            tut_tt.setText(childDataTuto[9]);
        }if(TutName.equals("Variables")){
            title_tt.setText("Variables");
            tut_tt.setText(childDataTuto[10]);
        }if(TutName.equals("Operators")){
            title_tt.setText("Operators");
            tut_tt.setText(childDataTuto[11]);
        }if(TutName.equals("Array")){
            title_tt.setText("Array");
            tut_tt.setText(childDataTuto[12]);
        }if(TutName.equals("Pointer")){
            title_tt.setText("Pointer");
            tut_tt.setText(childDataTuto[13]);
        }if(TutName.equals("String")){
            title_tt.setText("String");
            tut_tt.setText(childDataTuto[14]);
        }
    }
}

