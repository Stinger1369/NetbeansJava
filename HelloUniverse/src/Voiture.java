import static java.lang.System.*;

public class Voiture {

    int nbPortes = 5;
    boolean automatique;
    String couleur = new String("Rouge");
    String name;
    int rapportCourant;
    int vitesse=10;
   Moteur moteur= new Moteur();
   static int nbRoues=4;
   static String form= "Sphérique";

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

    Ville transporter(Passager passager, Ville villeDeDepart){
        out.println("Je transporte un passager qui s'appelle "+passager.nom +" "+ passager.prenom+ "Le passager est parti de la ville de "+villeDeDepart.nom);
        Ville villeDeDestination= new Ville();
        villeDeDestination.nom=" Paris";

        return villeDeDestination;
    }



}
