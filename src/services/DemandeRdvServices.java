package services;

import entites.*;

public class DemandeRdvServices {
    private final int N = 10;
    private DemandeRdv tdmd[] = new DemandeRdv[N];
    int n;

    public DemandeRdv[] listesCommandes() {
        return tdmd;
    }

    public void ajouterDemandeRdv(DemandeRdv cmd) {
        if (n < N) {
            tdmd[n] = cmd;
            n++;
            System.out.println("rdv ajouter");
        } else {
            System.out.println("tab est rempli");
        }
    }

    public DemandeRdv getDemandeById(int id){
        for (int i = 0; i < n; i++) {
            if(tdmd[i].getId() == id){
                return tdmd[i];
            }
        }
        return null;
    }
}
