package HospitalManagement;

import HospitalManagement.doctor.Doctor;
import HospitalManagement.patient.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[2];
        doctors[0] = new Doctor(1, "Dr. Smith", "Cardiology", 1200.0);
        doctors[1] = new Doctor(2, "Dr. Johnson", "Neurology", 1000.0);

        Patient[] patients = new Patient[3];
        patients[0] = new Patient(101, "Alice", "Heart Problem", 32);
        patients[1] = new Patient(102, "Bob", "Migraine", 28);
        patients[2] = new Patient(103, "Charlie", "Stroke", 45);

        // assign patients to the right doctor based on specialization
        Doctor cardiologist = doctors[0];
        Doctor neurologist = doctors[1];

        System.out.println("Hospital Management System");
        System.out.println("========================================");

        assignAndDisplay(patients[0], cardiologist, "Cardiology");
        assignAndDisplay(patients[1], neurologist, "Neurology");
        assignAndDisplay(patients[2], neurologist, "Neurology");

        double totalCardioFee = 0;
        double totalNeuroFee = 0;

        totalCardioFee = 1 * cardiologist.getConsultationFee();
        totalNeuroFee = 2 * neurologist.getConsultationFee();

        System.out.println("\nTotal consultation fee collected by " + cardiologist.getName() + ": $" + totalCardioFee);
        System.out.println("Total consultation fee collected by " + neurologist.getName() + ": $" + totalNeuroFee);
    }

    public static void assignAndDisplay(Patient patient, Doctor doctor, String requiredSpecialization) {
        if (doctor.getSpecialization().equalsIgnoreCase(requiredSpecialization)) {
            System.out.println("\nPatient assigned to Doctor:");
            doctor.displayDoctor();
            System.out.println("Patient Details:");
            patient.displayPatient();
        } else {
            System.out.println("No matching doctor available for " + patient.getName());
        }
    }
}