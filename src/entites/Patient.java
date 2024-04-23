package entites;

import java.util.Arrays;

public class Patient {
    private int id;
    private String nomComplet;
    private String tel;
    private String numero;
    static private int nbrePatients;
    private final int NBRE = 10;
    private DemandeRdv[] tabDemandeRdvs = new DemandeRdv[NBRE];
    private int n;

    public Patient() {
        nbrePatients++;
        id = nbrePatients;
        this.numero = String.format("PAT%04d", id); 
    }

    public Patient(String nomComplet, String tel) {
        nbrePatients++;
        this.id = nbrePatients;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.numero = String.format("PAT%04d", id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }
       ;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        if(nomComplet!=""){
            this.nomComplet = nomComplet;
        }
       
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if(tel!=""){
            this.tel = tel;
        }
       
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static int getNbrePatients() {
        return nbrePatients;
    }

    public static void NbrePatients(int nbrePatients) {
        Patient.nbrePatients = nbrePatients;
    }

    public int getNBRE() {
        return NBRE;
    }

    public DemandeRdv[] getTabDemandeRdvs() {
        return tabDemandeRdvs;
    }

    public void addTabDemandeRdvs(DemandeRdv d) {
       if(n<NBRE){
        tabDemandeRdvs[n]=d;
        n++;
       }else
       System.out.println("tab est rempli");
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", nomComplet=" + nomComplet + ", tel=" + tel + ", numero=" + numero + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomComplet == null) ? 0 : nomComplet.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + NBRE;
        result = prime * result + Arrays.hashCode(tabDemandeRdvs);
        result = prime * result + n;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (id != other.id)
            return false;
        if (nomComplet == null) {
            if (other.nomComplet != null)
                return false;
        } else if (!nomComplet.equals(other.nomComplet))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (NBRE != other.NBRE)
            return false;
        if (!Arrays.equals(tabDemandeRdvs, other.tabDemandeRdvs))
            return false;
        if (n != other.n)
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
