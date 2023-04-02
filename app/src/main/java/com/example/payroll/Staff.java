package com.example.payroll;

import android.text.Editable;

public class Staff {
    private String name;
    private Editable salary;

    public Staff(String name, Editable salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Editable getSalary() {
        return salary;
    }

    public void setSalary(Editable salary) {
        this.salary = salary;
    }
}
