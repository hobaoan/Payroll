package com.example.payroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Staff> arraylist;


    public Adapter(Context context, int layout, ArrayList<Staff> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arrayList;
    }


    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return arraylist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewStaff;
        if(view == null)
            viewStaff = View.inflate(viewGroup.getContext(), this.layout,null);
        else {
            viewStaff = view;
        }
        Staff staff = this.arraylist.get(i);

        TextView name = viewStaff.findViewById(R.id.result_name);
        TextView salary = viewStaff.findViewById(R.id.result_slary);

        name.setText(staff.getName());
        salary.setText(staff.getSalary());

        return viewStaff;
    }
}
