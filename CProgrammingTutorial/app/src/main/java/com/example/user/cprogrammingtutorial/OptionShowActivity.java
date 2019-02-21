package com.example.user.cprogrammingtutorial;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;

public class OptionShowActivity extends AppCompatActivity {

    private Button tutorialBtn;
    private Button programBtn;
    private Button questionBtn;
    private Button contactBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_show);

        tutorialBtn = (Button) findViewById(R.id.tutorialBtnID);
        programBtn = (Button) findViewById(R.id.programBtnID);
        questionBtn = (Button) findViewById(R.id.quesBtnID);
        contactBtn = (Button) findViewById(R.id.contactBtnID);

        tutorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tutorialIntent = new Intent(OptionShowActivity.this, TutorialListActivity.class);
                startActivity(tutorialIntent);

            }
        });

        programBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent programIntent = new Intent(OptionShowActivity.this, ProgramListActivity.class);
                startActivity(programIntent);

            }
        });

        questionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent questionIntent = new Intent(OptionShowActivity.this, QuestionActivity.class);
                startActivity(questionIntent);

            }
        });

        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent contactIntent = new Intent(OptionShowActivity.this, ContactActivity.class);
                startActivity(contactIntent);

            }
        });


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogueBuilder = new AlertDialog.Builder(OptionShowActivity.this);
        alertDialogueBuilder.setIcon(R.drawable.alert_dialogue);
        alertDialogueBuilder.setTitle("Confirm Exit");
        alertDialogueBuilder.setMessage("Do you really want to exit");
        alertDialogueBuilder.setCancelable(false);

        alertDialogueBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogueBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogueBuilder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.shareMenuId){
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");

            String subject = "C programming app";
            String body = "This app is useful.";

            shareIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
            shareIntent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(shareIntent,"share with"));
        }
        if(item.getItemId() == R.id.ratingId){
            Intent ratingIntent = new Intent(getApplicationContext(),RatingActivity.class);
            startActivity(ratingIntent);

        }
        if(item.getItemId() == R.id.aboutId){

            Intent aboutIntent = new Intent(getApplicationContext(),AboutUsActivity.class);
            startActivity(aboutIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
