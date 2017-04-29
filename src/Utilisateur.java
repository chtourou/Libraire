

import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateur {

    public static void main(String[] args) {

        ArrayList<Livre> livres = initialiserBibliotheque();

        while (true) {
            choixUtilisateur(livres);
        }

    }

    private static ArrayList<Livre> initialiserBibliotheque() {
        ArrayList<Livre> livres = new ArrayList<>();
        Auteur auteur = new Auteur("Fathi","Ftouh","Congo");
        Livre liv1 = new Livre("nom_a", auteur, "type_a", "3342");
        Livre liv2 = new Livre("nom_b", auteur, "type_b", "8675");
        Livre liv3 = new Livre("nom_c", auteur, "type_c", "4756");
        livres.add(liv1);
        livres.add(liv2);
        livres.add(liv3);
        return livres;
    }
//Ajout des livres

    public static void AddLivre(ArrayList<Livre> list) {
        Scanner scan = new Scanner(System.in);

        String nom, auteur, type, code;

        System.out.println("Donner nom du livre");

        nom = scan.nextLine();

        System.out.println("Donner auteur du livre");

        auteur = scan.nextLine();

        System.out.println("Donner type du livre");

        type = scan.nextLine();

        System.out.println("Donner code du livre");

        code = scan.nextLine();

        //Livre liv = new Livre(nom, auteur, type, code);
        //list.add(liv);


    }

    public static void SupprimerLivre(ArrayList<Livre> list) {
        Scanner scan = new Scanner(System.in);

        //Supprimer des livres
        int pos;
        System.out.println("Donner la position du livre a supprimer:");
        Scanner scans = new Scanner(System.in);
        pos = scan.nextInt();
        list.remove(pos);
        System.out.println("Votre livre a été supprimer av succes");
    }


    public static void choixUtilisateur(ArrayList<Livre> list) {
        System.out.println("Donner votre choix:");
        System.out.println("1 : Ajouter livre");
        System.out.println("2 : Supprimer Livre");
        System.out.println("3 : Affich Lier liste des livres");
        Scanner scan = new Scanner(System.in);
        int choix = scan.nextInt();

        if (choix == 1) {
            AddLivre(list);
        } else if (choix == 2) {
            SupprimerLivre(list);
        } else if (choix == 3) {
            AfficherListeDesLivres(list);
        }

    }

    private static void AfficherListeDesLivres(ArrayList<Livre> list) {
        System.out.println("LISTE DES LIVRES:");
        for (int i = 0; i < list.size(); i++) {

            System.out.println("pos = " + i);
            System.out.println(list.get(i).getInfo());

        }
    }



}




