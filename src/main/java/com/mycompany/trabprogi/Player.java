package com.mycompany.trabprogi;

public class Player extends Employee{
    int goals;

    public Player(String name, double salary, int Tnumber, String position) {
        super(name, salary, Tnumber, position);
        this.goals = 0;
    }

    //GET AND SET
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }    
}
