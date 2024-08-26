package com.mycompany.trabprogi;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import com.mycompany.view.Menu;

public class main {

    //ADICIONA O FUNCIONARIO
    public static Player[] addEmpl(Player employee, Player aux[]) {

        int i = 0;
        while (i < 11) {
            if (aux[i] == null) {
                aux[i] = employee;
                break;
            }
            i++;
        }
        return aux;
    }

    //CRIA O TREINADOR
    public static Coach makeCoach(Scanner in, String str) {

        Coach aux = new Coach(null, 0, 0, "Coach");
        String[] array = str.split(";");
        aux.setName(array[0]);
        aux.setSalary(Double.parseDouble(array[1]));

        return aux;
    }

    //CRIA O JOGADOR
    public static Player makePlayer(Scanner in, String str) {

        Player aux = new Player(null, 0, 0, null);
        String[] array = str.split(";");
        aux.setName(array[0]);
        aux.setSalary(Double.parseDouble(array[1]));
        aux.setTnumber(Integer.parseInt(array[2]));
        aux.setPosition(array[3]);

        return aux;
    }

    //CRIA O TIME, AO LER O ARQUIVO
    public static Table makeTeam(Scanner in, String str) {

        Player arrayAux[] = new Player[11];
        Table aux = new Table(null, 0, 0, 0);
        Team t = new Team(null, 0, null, null, null);

        while (true) {
            String[] array = str.split(":");

            switch(array[0]) {
                case "Team" -> {
                    t.setName(array[1]);
                }
                case "Founded" -> {
                    t.setFounded(Integer.parseInt(array[1]));
                }
                case "Formation" -> {
                    t.setFormation(array[1]);
                }
                case "Player" -> {
                    arrayAux = addEmpl(makePlayer(in, array[1]), arrayAux);
                }
                case "Coach" -> {
                t.setCoach(makeCoach(in, array[1]));
                t.setEmployees(arrayAux);
                aux.setInstitution(t);
                return aux;
                }
            }
            str = in.nextLine();
        }
    }

    public static void main(String[] args) throws IOException{
        
        //CRIA A LIGA
        Table[] empty = new Table[20];
        League premier = new League("Premier League", 38, 1, empty);

        try {
            //LE O ARQUIVO
            Scanner in = new Scanner(new FileReader("src/main/java/com/mycompany/trabprogi/Teams.txt"));

            while (in.hasNextLine()) {
                String line = in.nextLine();
                Table aux = makeTeam(in, line);
                premier.setClassification(aux);
            }
            in.close();
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        
        //COLOCA ELA COMO GLOBAL
        Premier.setPremierLeague(premier);
        
        //CHAMA O JFRAME
        Menu frame = new Menu();
        frame.setDefaultCloseOperation(Menu.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}