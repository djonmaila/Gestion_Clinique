package gestionClinique;


import java.util.ArrayList;

public class Medecin {
    private String nom;
    private String specialite;
    private ArrayList<Patient> patients;

    public Medecin(String nom,String specialite){
        this.nom = nom;
        this.specialite = specialite;
    }

    public void initListPatient(){
        patients = new ArrayList<Patient>();
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
