package com.mycompany.trabprogi;

import java.lang.Comparable;

public class Table implements Comparable<Table> {
    private Team institution;
    private int points;
    private int goals;
    private int gConced;

    //CONSTRUCT
    public Table(Team institution, int points, int goals, int gConced) {
        this.institution = institution;
        this.points = points;
        this.goals = goals;
        this.gConced = gConced;
    }

    //GETTERS AND SETTERS
    public Team getInstitution() {
        return institution;
    }
    public void setInstitution(Team institution) {
        this.institution = institution;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public int getgConced() {
        return gConced;
    }
    public void setgConced(int gConced) {
        this.gConced = gConced;
    }
    
    //METODO DE ORDENAR O VETOR, COMPARANDO PRIMEIRO PONTOS, DEPOIS GOLS, E DEPOIS NOME
    @Override
    public int compareTo(Table b) {
        if (this.points != b.points) {
            return Integer.compare(b.points, this.points);
        }
        if (this.goals != b.goals) {
            return Integer.compare(b.goals, this.goals);
        }
        return this.institution.getName().compareTo(b.institution.getName());
    }
}
