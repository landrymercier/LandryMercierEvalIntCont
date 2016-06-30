package com.poec;

import java.util.Calendar;

public class Etudiant {

    private String nom;

    private String prenom;

    private String adresse;

    private int annee;

    public Etudiant(String nom, String prenom, String adresse, int annee) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge(){
        int age = 0;

        Calendar calendrier;
        calendrier = Calendar.getInstance();
        int anneeEnCours = calendrier.get(Calendar.YEAR);
        age=anneeEnCours-annee;

        return age;
    }
}
