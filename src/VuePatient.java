import entites.*;
import java.util.Scanner;

public class VuePatient {

    public static Patient saisirPatient(Scanner sc) {
        Patient cl = new Patient();
        do {

            sc.nextLine();
            System.out.println("nomcomplet???\n");
            cl.setNomComplet(sc.nextLine());
        } while (cl.getNomComplet() == null || cl.getNomComplet().isEmpty());

        do {
            System.out.println("telephone???\n");
            cl.setTel(sc.nextLine());
        } while (cl.getTel() == null || cl.getTel().isEmpty());

        return cl;
    }

    public static void listerPatient(Patient[] t) {
        for (int index = 0; index < t.length; index++) {
            if (t[index] == null)
                return;
            System.out.println(t[index]);
        }
    }
}
