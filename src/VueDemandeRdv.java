import entites.*;
import enumerations.*;
import services.*;
import java.util.Scanner;

public class VueDemandeRdv {
    public static void listerDemandeRdv(DemandeRdv[] c) {
        for (int index = 0; index < c.length; index++) {
            if (c[index] == null)
                return;
            System.out.println(c[index]);
        }
    }

    public static void listerDemandeRdv(DemandeRdv[] c, Etat etat) {
        for (int index = 0; index < c.length; index++) {
            if (c[index] == null)
                return;
            if (c[index].getEtat() == etat) {
                System.out.println(c[index]);
            }

        }
    }

    public static void listerDemandeRdv(DemandeRdv[] c, Specialite sp) {
        for (int index = 0; index < c.length; index++) {
            if (c[index] == null)
                return;
            if (c[index].getSpecialite() == sp) {
                System.out.println(c[index]);
            }

        }
    }

    public static Etat askEtat(Scanner sc) {
        int pos;
        do {
            System.out.println("1.....................Valider");
            System.out.println("2......................annuler");
            pos = sc.nextInt();
        } while (pos != 1 && pos != 2);
        return Etat.values()[pos - 1];
    }

    public static Specialite askSpecialite(Scanner sc) {
        int pos;
        do {
            System.out.println("1.....................cardiologie");
            System.out.println("2......................urologie");
            System.out.println("3......................ophtalmo");
            pos = sc.nextInt();
        } while (pos<1 && pos >3);
        return Specialite.values()[pos - 1];
    }

    public static void changerStateDemand(DemandeRdvServices services,Scanner sc){
        int id;
        DemandeRdv dmd;
        do {
            System.out.println("Id de l'article ?");
            id = sc.nextInt();
            dmd = services.getDemandeById(id);
        } while (dmd == null);
        System.out.println(dmd);
        dmd.changerEtat(askEtat(sc));
    }

    public static DemandeRdv saisiDemandeRdv(Scanner sc) {
        DemandeRdv dmd = new DemandeRdv();
        do {
            System.out.println("HEURE???\n");
            dmd.setHeure(sc.nextLine());
        } while (dmd.getHeure() == null || dmd.getHeure().isEmpty());
        do {
            System.out.println("Date???\n");
            dmd.setDate(sc.nextLine());
        } while (dmd.getDate() == null || dmd.getDate().isEmpty());

        do {
            System.out.println("motif???\n");
            dmd.setMotif(sc.nextLine());
        } while (dmd.getMotif() == null || dmd.getMotif().isEmpty());

        dmd.setSpecialite(askSpecialite(sc));
        return dmd;
    }

    public static int menu(Scanner sc) {
        System.out.println("\n1- Ajouter un Patient dans le Tableau");
        System.out.println("2- Lister tous les patients du Tableau");
        System.out.println("3- Enregistrer un RV pour un patient");
        System.out.println("4- Lister tous les RV par Etat");
        System.out.println("5-  Lister tous les RV par Spécialité");
        System.out.println("6- Traiter RV");
        System.out.println("7- Quitter\n");
        return sc.nextInt();
    }
}
