package com.example.payroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etSalary;
    Button btnCac;
    ListView listStaff;

    String name;
    Editable crossSalary ;

    ArrayList<Staff> arrayList = new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.ET_name);
        etSalary = findViewById(R.id.ET_salary);
        btnCac = findViewById(R.id.btn_Cac);



        listStaff = findViewById(R.id.list_Staff);

        btnCac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = String.valueOf(etName.getText());

                //Add công thức tính net
                crossSalary = etSalary.getText();

                arrayList.add(new Staff(name, crossSalary));
                adapter.notifyDataSetChanged();

            }
        });

        adapter = new Adapter(MainActivity.this, R.layout.item_listview, arrayList);
        listStaff.setAdapter(adapter);


    }
}