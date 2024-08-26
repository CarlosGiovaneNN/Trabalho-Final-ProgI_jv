package com.mycompany.trabprogi;

//CLASSE GLOBAL PARA USAR NOS JFRAME

public class Premier {
    private static League premierLeague;
    private static String[] display;
    private static String[] finalDisp;
    private static String[] teamsDisp;
    private static String[] team;

    //GETTERS AND SETTERS
    public static League getPremierLeague() {
        return premierLeague;
    }

    public static void setPremierLeague(League premierLeague) {
        if(Premier.premierLeague != null) return;
        Premier.premierLeague = premierLeague;
    }

    public static String[] getDisplay() {
        return display;
    }

    public static void setDisplay(String[] display) {
        Premier.display = display;
    }

    public static String[] getFinalDisp() {
        return finalDisp;
    }

    public static void setFinalDisp(String[] finalDisp) {
        Premier.finalDisp = finalDisp;
    }

    public static String[] getTeamsDisp() {
        return teamsDisp;
    }

    public static void setTeamsDisp(String[] teamsDisp) {
        Premier.teamsDisp = teamsDisp;
    }

    public static String[] getTeam() {
        return team;
    }

    public static void setTeam(String[] team) {
        Premier.team = team;
    }
}
