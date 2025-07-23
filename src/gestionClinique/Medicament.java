package gestionClinique;

public class Medicament {
    private String nom;
    private String dosage;

    public Medicament(String nom,String dosage){
        this.nom = nom;
        this.dosage = dosage;
    }

    public void afficheMedicament(){
        System.out.println("NomMedoc : "+this.nom);
        System.out.println("Dosage : "+this.dosage);
        System.out.println("-------------------------------------------------");
    }
}
