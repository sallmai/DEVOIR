import entites.*;
import services.*;
import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int choix;
        DemandeRdvServices srD=new DemandeRdvServices();
        PatientServices srP=new PatientServices(); 
       
        
        do {
         choix=VueDemandeRdv.menu(sc);
            switch(choix){
                case 1->{
                   srP.ajouterPatient(VuePatient.saisirPatient(sc));
                }
                case 2->{
                    VuePatient.listerPatient(srP.listePatients());
                }
                case 3->{
                    sc.nextLine();
                  Patient patient =srP.chercherPatient(srP.numero(sc));
                  if (patient==null) {
                    System.out.println("le client n'existe pas");
                  }else{
                    sc.nextLine();
                    DemandeRdv dmd=VueDemandeRdv.saisiDemandeRdv(sc);
                    dmd.setPatient(patient);
                   patient.addTabDemandeRdvs(dmd);
                    srD.ajouterDemandeRdv(dmd);
                  }
                }
                case 4->{
                    VueDemandeRdv.listerDemandeRdv(srD.listesCommandes(),VueDemandeRdv.askEtat(sc));

                }
                case 5->{
                  VueDemandeRdv.listerDemandeRdv(srD.listesCommandes(),VueDemandeRdv.askSpecialite(sc));
            }
                case 6->{
                  VueDemandeRdv.changerStateDemand(srD,sc);
                }
            }

        } while (choix!=7);
       

    }



    }

