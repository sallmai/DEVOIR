package entites;

import enumerations.*;

public class DemandeRdv {
   

    private int id;
    private String date;
    private String heure;
    private String motif;
    private Etat etat;
    private Specialite specialite;
    private Patient patient;
    static private int nbreD;

    public DemandeRdv(String date, String heure, String motif, Etat etat, Specialite specialite, Patient patient) {
        this.date = date;
        this.heure = heure;
        this.motif = motif;
        this.etat = Etat.ENCOURS;
        this.specialite = specialite;
        this.patient = patient;
    }


    public DemandeRdv() {
        nbreD++;
        id=nbreD;
        etat=Etat.ENCOURS;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date!=""){
            this.date = date;
        }
       
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        if(heure!=""){
            this.heure = heure;
        }
        
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        if(motif!=""){
            this.motif = motif;
        }
        
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "DemandeRdv [date=" + date + ", heure=" + heure + ", motif=" + motif + ", etat=" + etat + ", specialite="
                + specialite + ", patient=" + patient + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((heure == null) ? 0 : heure.hashCode());
        result = prime * result + ((motif == null) ? 0 : motif.hashCode());
        result = prime * result + ((etat == null) ? 0 : etat.hashCode());
        result = prime * result + ((specialite == null) ? 0 : specialite.hashCode());
        result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
        DemandeRdv other = (DemandeRdv) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (heure == null) {
            if (other.heure != null)
                return false;
        } else if (!heure.equals(other.heure))
            return false;
        if (motif == null) {
            if (other.motif != null)
                return false;
        } else if (!motif.equals(other.motif))
            return false;
        if (etat != other.etat)
            return false;
        if (specialite != other.specialite)
            return false;
        if (patient == null) {
            if (other.patient != null)
                return false;
        } else if (!patient.equals(other.patient))
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }


    public static int getNbreD() {
        return nbreD;
    }


    public static void setNbreD(int nbreD) {
        DemandeRdv.nbreD = nbreD;
    }

    public void changerEtat(Etat etat){
        this.etat = etat;
    }
}
