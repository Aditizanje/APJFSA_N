package Javaprogram;

// Base class: Doctor
class Doctor {
    public void diagnose() {
        System.out.println("Doctor is diagnosing the patient.");
    }
}

// Multilevel inheritance: Surgeon inherits from Doctor
class Surgeon extends Doctor {
   
    public void diagnose() {
        System.out.println("Surgeon is diagnosing the patient before surgery.");
    }

    public void performSurgery() {
        System.out.println("Surgeon is performing the surgery.");
    }
}

// Hierarchical inheritance: Nurse inherits from Doctor
class Nurse extends Doctor {
    @Override
    public void diagnose() {
        System.out.println("Nurse is taking vital signs before the doctor arrives.");
    }

    public void assistSurgery() {
        System.out.println("Nurse is assisting in the surgery.");
    }
}

// Main class to test both multilevel and hierarchical inheritance
public class MedicalTeam {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        System.out.println("Doctor's Diagnosis:");
        doctor.diagnose();

        System.out.println("\nSurgeon's Diagnosis:");
        surgeon.diagnose();
        surgeon.performSurgery();

        System.out.println("\nNurse's Diagnosis:");
        nurse.diagnose();
        nurse.assistSurgery();
    }
}
/*Output:
Doctor's Diagnosis:
Doctor is diagnosing the patient.

Surgeon's Diagnosis:
Surgeon is diagnosing the patient before surgery.
Surgeon is performing the surgery.

Nurse's Diagnosis:
Nurse is taking vital signs before the doctor arrives.
Nurse is assisting in the surgery.
 */
