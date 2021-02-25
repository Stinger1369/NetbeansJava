/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bilel
 */
public class HelloUniverse {

    public static void main(String... args){

        Voiture voitureDeBilel= new Voiture();
        voitureDeBilel.couleur = "vert";
        voitureDeBilel.name = "Ferrari";
        voitureDeBilel.automatique=true;
        voitureDeBilel.nbPortes=3;

        voitureDeBilel.couleur="Jaune";

       String ch1="leCielEstBleu";
       String ch2="leCielEStBleu";
        boolean egauxOuNon=ch1.equalsIgnoreCase(ch2);
        System.out.println(egauxOuNon);


        int nouvelleVitesse=voitureDeBilel.accelerer(50);
        System.out.println(nouvelleVitesse);

        Voiture voitureDeAmin = new Voiture();
        voitureDeAmin.nbPortes = 5;
        Moteur moteur=new Moteur();
        moteur.carburantion="diesel";
        moteur.nbCylindres=6;
        voitureDeAmin.moteur=moteur;

        voitureDeBilel.moteur=moteur;
        moteur.nbCylindres=8;

        System.out.println("Le nombre de cylindre de la voiture de Jérome est " + voitureDeAmin.moteur.nbCylindres);
        System.out.println("Le nombre de cylindre de la voiture de Bilel est " + voitureDeBilel.moteur.nbCylindres);

        Passager passager= new Passager();
        passager.nom="Dupont";
        passager.prenom="Vincent";
        Ville marseille=new Ville();
        marseille.nom="Marseille";
        voitureDeAmin.transporter(passager, marseille);


               Ville destination= voitureDeBilel.transporter(passager,marseille);
        System.out.println("Le passager est arrivée dans la ville de"+destination.nom);
        System.out.println("Le nombre des Roues de la voiture de bilel et :  "+voitureDeBilel.nbRoues );
        System.out.println("Le nombre des Roues d'une voiture en Generale est :  "+Voiture.nbRoues );
         Voiture.nbRoues=6;
        System.out.println("Le passager est arrivée dans la ville de"+destination.nom);
        System.out.println("Le nombre des Roues de la voiture de bilel et :  "+voitureDeBilel.nbRoues );
        System.out.println("Le nombre des Roues d'une voiture en Generale est :  "+Voiture.form );
        Voiture.klaxonner();

  }
}

