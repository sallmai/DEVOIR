package services;
import entites.*;
import java.util.*;

public class PatientServices {
    private final int NBRE = 100;
    private Patient tClient[] = new Patient[NBRE];
    int n;

    public Patient[] listePatients() {
        return tClient;
    }

     public String numero(Scanner sc) {
        System.out.println("entrer numero");
        return sc.nextLine();
    } 

    public void ajouterPatient(Patient P) {
        if (n < NBRE) {
            tClient[n] = P;
            n++;
            System.out.println("Patient ajouter");
        } else {
            System.out.println("tab est rempli");
        }
    }

    public Patient chercherPatient(String numero) {
        for (int index = 0; index < n; index++) {
            if (tClient[index].getNumero().equals(numero)) {
                return tClient[index];
            }
        }
        return null;
    }

}
