package com.example.user.cprogrammingtutorial;


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class TutorialAdapter extends BaseExpandableListAdapter {

    private Context context_tutorial;

    HashMap<String, List<String>> listChildData_tutorial;
    List<String> listHaederData_tutorial;

    public TutorialAdapter(Context context, HashMap<String, List<String>> listChildData_tutorial, List<String> listHaederData_tutorial) {
        this.context_tutorial = context;
        this.listHaederData_tutorial = listHaederData_tutorial;
        this.listChildData_tutorial = listChildData_tutorial;
    }

    @Override
    public int getGroupCount() {
        return listHaederData_tutorial.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listChildData_tutorial.get(listHaederData_tutorial.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listHaederData_tutorial.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listChildData_tutorial.get(listHaederData_tutorial.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {

        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String grp_tut_title = (String) getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater inflaterL = (LayoutInflater) context_tutorial.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflaterL.inflate(R.layout.tutorial_list_group, parent,false);
        }

        TextView textViewG = convertView.findViewById(R.id.textViewGroup_tut_Id);
        textViewG.setTypeface(null, Typeface.BOLD);
        textViewG.setText(grp_tut_title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String child_title = (String) getChild(groupPosition,childPosition);
        if(convertView == null){
            LayoutInflater L_inflater = (LayoutInflater) context_tutorial.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = L_inflater.inflate(R.layout.tutorial_list_child, parent,false);


        }
        TextView child_tut_tv = convertView.findViewById(R.id.textViewChild_tut_Id);
        child_tut_tv.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
