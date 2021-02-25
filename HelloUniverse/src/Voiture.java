import static java.lang.System.*;

public class Voiture {

    int nbPortes = 5;
    boolean automatique;
    String couleur = "Rouge";
    String name;
    int rapportCourant;
    int vitesse=10;
   Moteur moteur= new Moteur();
   static int nbRoues=4;
   static String form= "Sphérique";

     Voiture() {
         System.out.println("La voiture de Sarah est en cours de construction");
    }
   
    static void klaxonner(){
    out.println("Tututut!!!");
    }
        int accelerer(){
    out.println("J'accelere");
    return 100;
    }
    int accelerer(int vitesse){
        out.println("J'accelere");
        this.vitesse=this.vitesse+vitesse;
        return vitesse;
    }
    int passerRapport(boolean augmenter){
    if (augmenter){
    rapportCourant++;
    }else{
    rapportCourant--;
    }
    return rapportCourant;
    }
    static void tourner(boolean droite, int angle){
        String droiteOuGauche=null;
        if(droite){
            droiteOuGauche="droite";
        }else{
        droiteOuGauche="gauche";
        }
        
        System.out.println("Les "+nbRoues+" roues de la voiture tournent a "+droiteOuGauche+"d'un angle de "+angle);
    }
    
    void tourner(String droiteOuGauche, int angle){
    System.out.println("La voiture va tourne a "+droiteOuGauche+"d'un angle de "+angle);
    }
            


    Ville transporter(Passager passager, Ville villeDeDepart){
        out.println("Je transporte un passager qui s'appelle "+passager.nom +" "+ passager.prenom+ "Le passager est parti de la ville de "+villeDeDepart.nom);
        Ville villeDeDestination= new Ville();
        villeDeDestination.nom=" Paris";

        return villeDeDestination;
    }



}
