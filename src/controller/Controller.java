package controller;

import gestionClinique.Medecin;
import gestionClinique.Medicament;
import gestionClinique.Patient;

import java.io.*;
import java.util.ArrayList;

public class Controller {
    public void savePatient(Patient patient){
        File file = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/patient.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(patient.getNom()+" "+patient.getAge());
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error to save patient");
        }
        saveMedicamentPatient(patient);
    }
    public void loadPatient(){
        File file = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/patient.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

        }catch (IOException e){
            System.out.println("Error to save patient");
        }
    }
    public void saveMedicamentPatient(Patient patient){
        File files = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/patientMedicament.txt");
        ArrayList<Medicament> medicaments = patient.getMedicaments();
        if(medicaments.size()!=0) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(files))) {
                for (Medicament m : medicaments) {
                    bufferedWriter.write(patient.getNom() + " " + m.getNom() + " " + m.getDosage());
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error to save patient");
            }
        }
    }

    public void saveMedicament(Medicament medicament){
        File file = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/medicament.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(medicament.getNom()+" "+medicament.getDosage());
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error to save medicament");
        }
    }

    public void saveMedecin(Medecin medecin){
        File file = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/medecin.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(medecin.getNom()+" "+medecin.getSpecialite());
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error to save patient");
        }
        savePatientMedecin(medecin);
    }
    public void savePatientMedecin(Medecin medecin){
        File files = new File("/home/pythagore/Documents/Clinique/Clinique/src/Base_de_données/patientMedecin.txt");
        ArrayList<Patient> patients = medecin.getPatients();
        if(patients.size()!=0) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(files))) {
                for (Patient m : patients) {
                    bufferedWriter.write(medecin.getNom() + " " + m.getNom() + " " + m.getAge());
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error to save patient");
            }
        }
    }
}
