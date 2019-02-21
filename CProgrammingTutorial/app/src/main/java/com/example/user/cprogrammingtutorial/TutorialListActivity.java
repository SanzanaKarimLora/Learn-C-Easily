package com.example.user.cprogrammingtutorial;

import android.app.ExpandableListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TutorialListActivity extends AppCompatActivity {

    HashMap <String, List<String>> tutorial_category;
    List<String> tutorial_sub_category;
    ExpandableListView expLV_tutorial;
    TutorialAdapter tutorialAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_list);

        expLV_tutorial = (ExpandableListView) findViewById(R.id.exp_lv_tutorial_id);
        tutorial_category = DataProvider.getInfo();
        tutorial_sub_category = new ArrayList<String>(tutorial_category.keySet());

        tutorialAdapter = new TutorialAdapter(this, tutorial_category,tutorial_sub_category);
        expLV_tutorial.setAdapter(tutorialAdapter);


        expLV_tutorial.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(getBaseContext(),
                        tutorial_category.get(tutorial_sub_category.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT).show();
                if (groupPosition == 0) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Structure");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Union");
                        startActivity(i);
                    }

                }
                if (groupPosition == 1) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Formatted IO-printf & scanf");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Character IO-getchar & putchar");
                        startActivity(i);
                    }

                }
                if (groupPosition == 2) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Blocks and Scope");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Definition & Declaration");
                        startActivity(i);
                    }

                }
                if (groupPosition == 3) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Structure of a Program");
                        startActivity(i);
                    }

                }

                if (groupPosition == 4) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Function Basics");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Definition and Declaration");
                        startActivity(i);
                    }
                    if (childPosition == 2) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Standard Header Files");
                        startActivity(i);
                    }

                }

                if (groupPosition == 5) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Variables");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Operators");
                        startActivity(i);
                    }

                }

                if (groupPosition == 6) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Array");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Pointer");
                        startActivity(i);
                    }
                    if (childPosition == 2) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "String");
                        startActivity(i);
                    }

                }

                if (groupPosition == 7) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Introduction");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Advantage of C");
                        startActivity(i);
                    }

                }
                if (groupPosition == 8) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Conditional branching-if");
                        startActivity(i);
                    }
                    if (childPosition == 1) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Conditional selection-switch");
                        startActivity(i);
                    }
                    if (childPosition == 2) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Loops-while & for");
                        startActivity(i);
                    }
                    if (childPosition == 3) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "Break & continue");
                        startActivity(i);
                    }

                }

                if (groupPosition == 9) {
                    if (childPosition == 0) {
                        Intent i = new Intent(getApplicationContext(), TutorialShowActivity.class);
                        i.putExtra("tut", "File operations and Functions");
                        startActivity(i);
                    }

                }

                return false;
            }

        });


    }

}



