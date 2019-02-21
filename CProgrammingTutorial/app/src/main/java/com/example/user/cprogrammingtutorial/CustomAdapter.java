package com.example.user.cprogrammingtutorial;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter{

    private Context context;
    List<String> listHaederData;
    HashMap<String, List<String>> listChildData;

    public CustomAdapter(Context context, List<String> listHaederData, HashMap<String, List<String>> listChildData) {
        this.context = context;
        this.listHaederData = listHaederData;
        this.listChildData = listChildData;
    }

    @Override
    public int getGroupCount() {

        return listHaederData.size();
    }

    @Override
    public int getChildrenCount(int i) {

        return listChildData.get(listHaederData.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {

        return listHaederData.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listChildData.get(listHaederData.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        String headerText = (String) getGroup(i);

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.group_layout_faq, null);
        }

        TextView textView = view.findViewById(R.id.headerid);
        textView.setText(headerText);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String chlidText = (String) getChild(i,i1);

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.child_layout_faq, null);
        }

        TextView textView = view.findViewById(R.id.childid);
        textView.setText(chlidText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}

