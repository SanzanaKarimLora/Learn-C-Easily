package com.example.user.cprogrammingtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramShowActivity extends AppCompatActivity {

    private ImageView programIV;
    private ImageView outputIV;
    private TextView titleTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_show);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        programIV = (ImageView) findViewById(R.id.programID);
        outputIV = (ImageView) findViewById(R.id.outputID);
        titleTV = (TextView) findViewById(R.id.helloID);

        Bundle bundle_program = getIntent().getExtras();

        if(bundle_program != null){
            String programname = bundle_program.getString("program_name");
            showProgramWithOutput(programname);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void showProgramWithOutput(String programName){
        if(programName.equals("Hello World")){
            titleTV.setText("Hello World");
            programIV.setImageResource(R.drawable.hello_world_code);
            outputIV.setImageResource(R.drawable.hello_world_output);

        }
        if(programName.equals("Print Integer")){
            titleTV.setText("Print Integer");
            programIV.setImageResource(R.drawable.print_integer_code);
            outputIV.setImageResource(R.drawable.print_integer_output);

        }
        if(programName.equals("Addition of two numbers")){
            titleTV.setText("Addition of two numbers");
            programIV.setImageResource(R.drawable.add_two_num_input);
            outputIV.setImageResource(R.drawable.add_two_numbers_output);

        }

        if(programName.equals("Area of circle")){
            titleTV.setText("Area of circle");
            programIV.setImageResource(R.drawable.area_circle_c);
            outputIV.setImageResource(R.drawable.area_circle_o);

        }
        if(programName.equals("Odd or even")){
            titleTV.setText("Odd or even");
            programIV.setImageResource(R.drawable.odd_c);
            outputIV.setImageResource(R.drawable.odd_o);

        }
        if(programName.equals("Add n numbers")){
            titleTV.setText("Add n numbers");
            programIV.setImageResource(R.drawable.odd_c);
            outputIV.setImageResource(R.drawable.odd_o);

        }
        if(programName.equals("Add digits")){
            titleTV.setText("Add digits");
            programIV.setImageResource(R.drawable.odd_c);
            outputIV.setImageResource(R.drawable.odd_o);

        }
        if(programName.equals("Greatest of 3 numbers")){
            titleTV.setText("Greatest of 3 numbers");
            programIV.setImageResource(R.drawable.greatest_c);
            outputIV.setImageResource(R.drawable.greatest_o);

        }
        if(programName.equals("Sum of Even and Odd of a Number")){
            titleTV.setText("Sum of Even and Odd of a Number");
            programIV.setImageResource(R.drawable.sum_of_even_c);
            outputIV.setImageResource(R.drawable.sum_of_even_o);

        }
        if(programName.equals("Nested if else")){
            titleTV.setText("Nested if else");
            programIV.setImageResource(R.drawable.nested_c);
            outputIV.setImageResource(R.drawable.nested_o);

        }if(programName.equals("Leap year")){
            titleTV.setText("Leap year");
            programIV.setImageResource(R.drawable.leap_year_c);
            outputIV.setImageResource(R.drawable.leap_year_o);

        }
        if(programName.equals("Prime Number")){
            titleTV.setText("Prime Number");
            programIV.setImageResource(R.drawable.prime_c);
            outputIV.setImageResource(R.drawable.prime_o);

        }
        if(programName.equals("Fibonacci series")){
            titleTV.setText("Fibonacci series");
            programIV.setImageResource(R.drawable.fibo_c);
            outputIV.setImageResource(R.drawable.fibo_o);

        }
        if(programName.equals("Bubble sort")){
            titleTV.setText("Bubble sort");
            programIV.setImageResource(R.drawable.bubble_c);
            outputIV.setImageResource(R.drawable.bubble_o);

        }
    }
}
