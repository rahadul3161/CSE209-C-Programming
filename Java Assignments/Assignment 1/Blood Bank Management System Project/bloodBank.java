//Project: Blood Bank Management System.

import java.util.*;
class bloodBank {
    private Map<String, List<String>> bloodDonors;
    public bloodBank() {
        bloodDonors = new HashMap<>();
        bloodDonors.put("A+", new ArrayList<>());
        bloodDonors.put("A-", new ArrayList<>());
        bloodDonors.put("B+", new ArrayList<>());
        bloodDonors.put("B-", new ArrayList<>());
        bloodDonors.put("O+", new ArrayList<>());
        bloodDonors.put("O-", new ArrayList<>());
        bloodDonors.put("AB+", new ArrayList<>());
        bloodDonors.put("AB-", new ArrayList<>()); 
    }
    public void addDonor(String name, String bloodType){
        if (bloodDonors.containsKey(bloodType)) {
            bloodDonors.get(bloodType).add(name);
            System.out.println(name + " has been added as a donor with blood type " + bloodType);
        }
        else {
            System.out.println("Invalid blood type.");
        }
    }
    public void displayAvailableBlood() {
        System.out.println("\nAvailable Blood Types and Donors:");
        for (Map.Entry<String, List<String>> entry : bloodDonors.entrySet()){ 
            String bloodType = entry.getKey();
            List<String> donors = entry.getValue();
            System.out.println("Blood Type: " + bloodType);
            if (donors.isEmpty()){
                System.out.println("  No donors available.");
            } 
            else{
                System.out.println("  Donors: " + String.join(", ", donors));
            }
        }
    }
    public void searchDonorByBloodType(String bloodType){ 
        if (bloodDonors.containsKey(bloodType)) {
            List<String> donors = bloodDonors.get(bloodType);
            if (donors.isEmpty()) {
                System.out.println("No donors found for blood type " + bloodType);
            } 
            else {
                System.out.println("Donors with blood type " + bloodType + ": " + String.join(", ", donors));
            }
        } 
        else {
            System.out.println("Invalid blood type.");
        }
    }
}


public class bloodBank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bloodBank bloodBank = new bloodBank();
        while (true) {
            System.out.println("\nWelcome to PU_Blood_Bank Management System");
            System.out.println("1. Add Donor");
            System.out.println("2. Display Available Blood");
            System.out.println("3. Search Donor by Blood Type");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter donor name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter blood type (A+, A-, B+, B-, O+, O-, AB+, AB-): ");
                    String bloodType = scanner.nextLine().toUpperCase();
                    bloodBank.addDonor(name, bloodType);
                    break;
                case 2:
                    bloodBank.displayAvailableBlood();
                    break;
                case 3:
                    System.out.print("Enter blood type to search (A+, A-, B+, B-, O+, O-, AB+, AB-): ");
                    String searchType = scanner.nextLine().toUpperCase();
                    bloodBank.searchDonorByBloodType(searchType);
                    break;
                case 4:
                    System.out.println("Exiting the Blood Bank Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
