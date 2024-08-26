package com.mycompany.trabprogi;

import com.mycompany.trabprogi.Premier;

public class Team {
    private String name;
    private int founded;
    private String formation;
    private Player[] employees;
    private Coach coach;

    //CONSTRUCT
    public Team(String name, int founded, String formation, Player[] employees, Coach coach) {
        this.name = name;
        this.founded = founded;
        this.formation = formation;
        this.employees = employees;
        this.coach = coach;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFounded() {
        return founded;
    }
    public void setFounded(int founded) {
        this.founded = founded;
    }
    public Player[] getEmployees() {
        return employees;
    }
    public void setEmployees(Player[] employees) {
        this.employees = employees;
    }
    public String getFormation() {
        return formation;
    }
    public void setFormation(String formation) {
        this.formation = formation;
    }
    public Coach getCoach() {
        return coach;
    }
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    //METODOS PARA COMPLEMENTAR O CODIGO, CASO EU QUEIRA ADICIONAR CONTRATAÇÕES
    public void removEmpl(Player employee) {

        int i = 0;
        while( i < 11) {
            if(this.employees[i].getName() == employee.getName()) {
                this.employees[i] = null;
                break;
            }
            i++;
        }
    }

    public Player searchEmpl(String name) {
        
        int i = 0;
        while( i < 11) {
            if(this.employees[i].getName() == name) {
                return this.employees[i];
            }
            i++;
        }
        
        System.out.println("Player not found!");
        return null;
    }

    //PRINTAR O FUNCIONARIO NO JFRAME, CRIA UM ARRAY AUXILIAR GLOBAL
    public void printEmpl() {
        
        int i = 0;
        String[] aux = Premier.getTeam();
        
        while( i < 11) {
            if(this.employees[i] == null) {
                break;
            }
            else {
                aux[i+2] = this.employees[i].getTnumber() + " # " + this.employees[i].getName() + " - " + this.employees[i].getPosition() + ";";
            }
            i++;
        }
        aux[13] = "Coach: " + this.coach.getName() + ";\n";
        
        Premier.setTeam(aux);
    }

    //CALCULA QUEM FEZ O GOL NA PARTIDA ATRAVÉS DE NUMEROS ALEATÓRIOS E PORCENTAGEM DE CHANCE
    public void goalInMatch() {

        int random = (int) (Math.random() * 100 + 1);

        if(random < 2) {
            this.employees[0].setGoals(this.employees[0].getGoals() + 1);
        }

        else if(random < 15){

            Player[] array = new Player[5];
            int count = 0;

            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getPosition().equals("Defender")) {
                    array[count] = this.employees[i];
                    count++;
                }
            }

            int goalPlayer = random % count;
            
            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getName().equals(array[goalPlayer].getName())) {
                    this.employees[i].setGoals(this.employees[i].getGoals() + 1);
                }
            }
        }
        else if( random < 50) {

            Player[] array = new Player[5];
            int count = 0;

            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getPosition().equals("Midfield")) {
                    array[count] = this.employees[i];
                    count++;
                }
            }

            int goalPlayer = random % count;

            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getName().equals(array[goalPlayer].getName())) {
                    this.employees[i].setGoals(this.employees[i].getGoals() + 1);
                }
            }
        }
        else if(random > 49) {

            Player[] array = new Player[5];
            int count = 0;

            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getPosition().equals("Forward")) {
                    array[count] = this.employees[i];
                    count++;
                }
            }

            int goalPlayer = random % count;

            for(int i = 0; i < 11; i++) {
                
                if(this.employees[i].getName().equals(array[goalPlayer].getName())) {
                    this.employees[i].setGoals(this.employees[i].getGoals() + 1);
                }
            }
        }
    }
}