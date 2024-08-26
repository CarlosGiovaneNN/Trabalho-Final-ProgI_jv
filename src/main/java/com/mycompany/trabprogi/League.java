package com.mycompany.trabprogi;

import java.util.Arrays;
import com.mycompany.view.Round;
import com.mycompany.view.EndSeason;
import com.mycompany.view.ShowTeams;
import com.mycompany.view.TeamSearch;
import com.mycompany.view.MessageNotFound;


public class League {
    private String name;
    private int round;
    private int edition;
    final Table[] classification;

    //CONSTRUCT
    public League(String name, int round, int edition, Table[] classification) {
        this.name = name;
        this.round = round;
        this.edition = edition;
        this.classification = classification;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    
        public Table getClassification(int position) {
        return this.classification[position];
    }

    public void setClassification(Table intitution) {

        int i = 0;
        while (i < 20) {
            if (this.classification[i] == null) {
                this.classification[i] = intitution;
                break;
            }
            i++;
        }
    }

    //CALCULA OS PONTOS 
    public void calculatePoints(Table home, Table away, int golasA, int golasH) {

        if (golasA < golasH) {
            int gh = home.getGoals() + golasH;
            int ph = home.getPoints() + 3;
            int ch = home.getgConced() + golasA;

            int ga = away.getGoals() + golasA;
            int ca = away.getgConced() + golasH;

            home.setGoals(gh);
            home.setPoints(ph);
            home.setgConced(ch);

            away.setGoals(ga);
            away.setgConced(ca);
        } else if (golasA > golasH) {
            int gh = home.getGoals() + golasH;
            int ch = home.getgConced() + golasA;

            int pa = away.getPoints() + 3;
            int ga = away.getGoals() + golasA;
            int ca = away.getgConced() + golasH;

            home.setGoals(gh);
            home.setgConced(ch);

            away.setPoints(pa);
            away.setGoals(ga);
            away.setgConced(ca);
        } else {
            int gh = home.getGoals() + golasH;
            int ch = home.getgConced() + golasA;
            int ph = home.getPoints() + 1;

            int pa = away.getPoints() + 1;
            int ga = away.getGoals() + golasA;
            int ca = away.getgConced() + golasH;

            home.setGoals(gh);
            home.setgConced(ch);

            home.setPoints(ph);
            away.setPoints(pa);

            away.setGoals(ga);
            away.setgConced(ca);
        }
    }

    
    //CALCULA OS PONTOS ATRAVÉS DE NÚMEROS ALEATÓRIOS
    //QUEM ESTA JOGANDO EM CASA TEM VANTAGEM 
    public String simulateMatch(Table home, Table away, boolean t) {

        int random = (int) (Math.random() * 100 + 1);
        int golasH, golasA;

        if (random < 3) {
            golasH = (int) (Math.random() * 8 + 1);
            golasA = (int) (Math.random() * 2 + 1);
        } else if (random == 4) {
            golasA = (int) (Math.random() * 8 + 1);
            golasH = (int) (Math.random() * 2 + 1);
        } else if (random < 40) {
            golasA = (int) (Math.random() * 4 + 1);
            golasH = (int) (Math.random() * 2 + 1);
        } else {
            golasA = (int) (Math.random() * 2 + 1);
            golasH = (int) (Math.random() * 4 + 1);
        }

        this.calculatePoints(home, away, golasA, golasH);

        for(int i = 0; i < golasH; i++) {
            home.getInstitution().goalInMatch();
        }
        for(int i = 0; i < golasA; i++) {
            away.getInstitution().goalInMatch();
        }

        if (t == false) {
            String str = "" + home.getInstitution().getName() + " " + golasH + " x " + golasA + " " + away.getInstitution().getName();
            return str;
        }
        
        return null; 
    }

    //SIMULA AS RODADAS DO CAMPEAONATO
    public void simulateRound(boolean t) {

        if(this.getRound() < 1) {
            this.reset();
            this.setEdition(this.getEdition()+1);
        }
        
        String[] array = new String[11];
        if (t == false) {
            array[0] = "---------------------  Round: " + (39 - this.round) + "  ---------------------";        
        }

        int round = 39 - this.round;
  

        for (int match = 0; match < 10; match++) {
            int h = (round + match) % (19);
            int a = (19 - match + round) % (19);

            if (match == 0) {
                a = 19;
            }

            if (round >= (19)) {
                array[match + 1] = this.simulateMatch(this.classification[h], this.classification[a], t);
            } else {
                array[match + 1] = this.simulateMatch(this.classification[a], this.classification[h], t);
            }
        }

        //O FALSO É UMA FLAG QUE EU USEI PARA INDICAR SE É O BOTÃO SIMULAR A RODADA OU A TEMPORADA
        //FALSO = RODADA;
        //VERDADEIRO = TEMPORADA;
        if (t == false) {
            Premier.setDisplay(array);
            Round frame = new Round();
            frame.setDefaultCloseOperation(Round.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        }

        this.round--;
        
        if (this.round == 0) {
            String[] finalArray = new String[4];
            
            Table[] aux = new Table[20];

            for(int i = 0; i < 20; i++) {
                aux[i] = this.getClassification(i);
            }
            
            Arrays.sort(aux);
            
            finalArray[0] = aux[0].getInstitution().getName() + " is the Champion!!!";
            Premier.setFinalDisp(finalArray);
            this.artilleryCalculate();
            
            EndSeason frameFinal = new EndSeason();
            frameFinal.setDefaultCloseOperation(EndSeason.DISPOSE_ON_CLOSE);
            frameFinal.setVisible(true);
        }
    }

    //PRINTARÁ TODOS OS TIMES NA TABELA
    public void printAll() {

        String[] aux = new String[21];

        Table[] array = new Table[20];

        for(int i = 0; i < 20; i++) {
            array[i] = getClassification(i);
        }
        Arrays.sort(array);


        for (int i = 0; i < 20; i++) {
            aux[i] = i + 1 + " - " + array[i].getInstitution().getName() + " : " + array[i].getPoints() + ";";
        }

        aux[20] = "Premier League - Round: " + (38 - this.round);
        
        Premier.setTeamsDisp(aux);

        ShowTeams frameShow = new ShowTeams();
        frameShow.setDefaultCloseOperation(ShowTeams.DISPOSE_ON_CLOSE);
        frameShow.setVisible(true);
    }

    //CHAMARÁ A FUNÇÃO DE RODADA ATÉ ACABAR AS RODADAS
    public void simulateTemp() {

        int last_rounds = this.round;

        for (int i = 0; i < last_rounds; i++) {
            simulateRound(true);
        }
    }

    //MOSTRA O TIME QUE FOI SELECIONADO
    public void showTeam(String str) {

        boolean flag = false;
        String[] aux = new String[14];

        for (int i = 0; i < 20; i++) {
            if (this.classification[i].getInstitution().getName().equals(str)) {
                aux[0] = str;
                aux[1] = "Formation: " + this.classification[i].getInstitution().getFormation();
                Premier.setTeam(aux);
                this.classification[i].getInstitution().printEmpl();
                flag = true;
                aux = Premier.getTeam();
                
                TeamSearch frameShow = new TeamSearch();
                frameShow.setDefaultCloseOperation(TeamSearch.DISPOSE_ON_CLOSE);
                frameShow.setVisible(true);                
                break;
            }
        }
        if (!flag) {
            MessageNotFound frameMsg = new MessageNotFound();
            frameMsg.setDefaultCloseOperation(MessageNotFound.DISPOSE_ON_CLOSE);
            frameMsg.setVisible(true);                

        }
    }

    //CALCULA QUEM FOI O ARTILHEIRO DA TEMPORADA
    public void artilleryCalculate() {

        Player first = new Player(null, 0.0, 0, null);
        Player second = new Player(null, 0.0, 0, null);
        Player third = new Player(null, 0.0, 0, null);

        for(int t = 0; t < 20; t++) {

            Player[] teamAux = this.classification[t].getInstitution().getEmployees(); 
            for(int p = 0; p < 11; p++) {
                
                if(teamAux[p].getGoals() > first.getGoals()) {
                    third = second;
                    second = first;
                    first = teamAux[p];
                }
                else if(teamAux[p].getGoals() > second.getGoals()) {
                    third = second;
                    second = teamAux[p];
                }
                else if(teamAux[p].getGoals() > third.getGoals()) {
                    third = teamAux[p];
                }
            }
        }

        String[] aux = Premier.getFinalDisp();
        
        aux[1] = "First Place: " + first.getName() + " - " + first.getGoals() + " goals";
        aux[2] = "Second Place: " + second.getName() + " - " + second.getGoals() + " goals";
        aux[3] = "Third Place: " + third.getName() + " - " + third.getGoals() + " goals\n";
    
        Premier.setFinalDisp(aux);
    }

    //RESETA A TEMPORADA
    public void reset() {

        this.round = 38;

        for (int i = 0; i < 20; i++) {
            this.classification[i].setGoals(0);
            this.classification[i].setPoints(0);
            this.classification[i].setgConced(0);
            
            Player[] teamAux = this.classification[i].getInstitution().getEmployees(); 
            
            for(int p = 0; p < 11; p++) {
               teamAux[p].setGoals(0);
            }
            this.classification[i].getInstitution().setEmployees(teamAux);
        }
    }
}
