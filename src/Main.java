import controller.Controller;
import gestionClinique.Medecin;
import gestionClinique.Medicament;
import gestionClinique.Patient;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Medicament medicament = new Medicament("Paracetamol","500mg");
        Medicament medicament1 = new Medicament("Amoxiciline","400mg");

        ArrayList<Medicament> medicaments = new ArrayList<Medicament>();
        medicaments.add(medicament);
        medicaments.add(medicament1);

        Patient patient = new Patient("Djong",24);
        Patient patient1 = new Patient("Keba",19);

        Medecin medecin = new Medecin("NDikmo","Cardiologue");


        patient.ajouterMedicament(medicament);
        patient.ajouterMedicament(medicament1);

        System.out.println("Le patient");
        System.out.println("-------------------------------------------------");
        patient.affichePatient();
        System.out.println("Ses médicaments : ");
        System.out.println("-------------------------------------------------");
        patient.afficheMedicament();
        controller.savePatient(patient);
        System.out.println();


        System.out.println("Le medecin : ");
        System.out.println();
        medecin.afficherMedecin();
        System.out.println("Patient consulter par : "+medecin.getNom());
        medecin.ajouterPatient(patient);
        medecin.ajouterPatient(patient1);
        medecin.afficherPatient();
        controller.saveMedecin(medecin);


        System.out.println();
        System.out.println();
        System.out.println("Les medicaments disponibles dans la clinique sont : ");
        System.out.println("-------------------------------------------------");
        for (Medicament m : medicaments){
            m.afficheMedicament();
            controller.saveMedicament(m);
        }

    }
}