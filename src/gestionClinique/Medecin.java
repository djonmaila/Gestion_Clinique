package gestionClinique;


import java.util.ArrayList;

public class Medecin {
    private String nom;
    private String specialite;
    private ArrayList<Patient> patients;

    public Medecin(String nom,String specialite){
        this.nom = nom;
        this.specialite = specialite;
        patients = new ArrayList<Patient>();
    }

    public String getSpecialite() {
        return specialite;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void afficherMedecin(){
        System.out.println("Nom : "+this.nom);
        System.out.println("Spécialité : "+this.specialite);
        System.out.println("-------------------------------------------------");
    }

    public String getNom(){
        return this.nom;
    }
    public void ajouterPatient(Patient patient){
        patients.add(patient);
    }

    public void afficherPatient(){
        for (Patient p : patients){
            p.affichePatient();
        }
    }
}
