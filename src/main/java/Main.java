//package com.poec;

public class Main {

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Tourman", "Benjamin", "2 rue Fénélon", 1986);
        System.out.println("Etudiant n°1 :");
        System.out.println("Nom : " + etudiant1.getNom());
        System.out.println("Prénom : " + etudiant1.getPrenom());
        System.out.println("Adresse : " + etudiant1.getAdresse());
        System.out.println("Age : " + etudiant1.getAge());
    }
}
