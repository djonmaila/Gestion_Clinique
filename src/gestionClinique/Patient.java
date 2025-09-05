package gestionClinique;

import java.util.ArrayList;

public class Patient {
    private String nom;
    private int age;
    private ArrayList<Medicament> medicaments;

    public Patient(String nom,int age){
        this.nom = nom;
        this.age = age;
        medicaments = new ArrayList<Medicament>();
    }


    public  void ajouterMedicament(Medicament medicament){
        medicaments.add(medicament);
    }
    public void affichePatient(){
        System.out.println("NOM : "+this.nom);
        System.out.println("AGE : "+this.age);
        System.out.println("-------------------------------------------------");
    }

    public void afficheMedicament(){
        for(Medicament m : medicaments){
            m.afficheMedicament();
        }
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Medicament> getMedicaments() {
        return medicaments;
    }
}
