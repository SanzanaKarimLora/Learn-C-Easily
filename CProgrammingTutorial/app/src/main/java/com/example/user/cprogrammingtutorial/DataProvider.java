package com.example.user.cprogrammingtutorial;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> tutorial_details = new  HashMap<String, List<String>>();

        List<String> introduction = new ArrayList<String>();
        introduction.add("Introduction");
        introduction.add("Advantage of C");

        List<String> example = new ArrayList<String>();
        example.add("Structure of a Program");

        List<String> variable_operator = new ArrayList<String>();
        variable_operator.add("Variables");
        variable_operator.add("Operators");

        List<String> input_output = new ArrayList<String>();
        input_output.add("Formatted IO-printf & scanf");
        input_output.add("Character IO-getchar & putchar");

        List<String> flow_of_control = new ArrayList<String>();
        flow_of_control.add("Conditional branching - if");
        flow_of_control.add("Conditional selection - switch");
        flow_of_control.add("Loops - while & for");
        flow_of_control.add("Braek & continue");

        List<String> functions = new ArrayList<String>();
        functions.add("Function Basics");
        functions.add("Definition and Declaration");
        functions.add("Standard Header Files");

        List<String> scope_blocks = new ArrayList<String>();
        scope_blocks.add("Blocks and Scope");
        scope_blocks.add("Definition & Declaration");

        List<String> array_pointer_string = new ArrayList<String>();
        array_pointer_string.add("Array");
        array_pointer_string.add("Pointer");
        array_pointer_string.add("String");

        List<String> structure_union = new ArrayList<String>();
        structure_union.add("Structure");
        structure_union.add("Union");
        List<String> files = new ArrayList<String>();
        files.add("Files operations and Functions");

        tutorial_details.put("Introduction", introduction);
        tutorial_details.put("An example of a C program", example);
        tutorial_details.put("Variables & Operators", variable_operator);
        tutorial_details.put("Input & Output", input_output);
        tutorial_details.put("Flow of control", flow_of_control);
        tutorial_details.put("Functions", functions);
        tutorial_details.put("Scopes, blocks & avriables", scope_blocks);
        tutorial_details.put("Arrays, pointer & string", array_pointer_string);
        tutorial_details.put("Structure and union", structure_union);
        tutorial_details.put("Files", files);

        return tutorial_details;

    }
}
