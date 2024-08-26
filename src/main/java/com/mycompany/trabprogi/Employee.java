package com.mycompany.trabprogi;

abstract class Employee {

    private String name;
    private double salary;
    private int Tnumber;
    private String position;

    public Employee(String name, double salary, int Tnumber, String position) {
        this.name = name;
        this.salary = salary;
        this.Tnumber = Tnumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getTnumber() {
        return Tnumber;
    }
    public void setTnumber(int Tnumber) {
        this.Tnumber = Tnumber;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String posiiton) {
        this.position = posiiton;
    }

}