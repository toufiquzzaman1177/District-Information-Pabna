package DistrictDyno;

import java.util.Scanner;

class Upazila {
    String name;
    int population;
    float area;
    String chairman;
    String uno;
    String unions;
}

class Education {
    String name;
    String type;
    int students;
    int teachers;
    int established;
    String address;
}

class Healthcare {
    String name;
    int doctors;
    int nurses;
    int beds;
    String services;
}

class PoliceStation {
    String name;
    int officers;
    String oc;
    String contact;
}

class HistoricalPlace {
    String name;
    String era;
    String significance;
    String location;
}

class River {
    String name;
    float area;
    String address;
}

class Other {
    String category;
    String details;
}

public class DistrictManagement {
    // Arrays to store data
    static Upazila[] upazilas = new Upazila[9];
    static Education[] education = new Education[8];
    static Healthcare[] healthcare = new Healthcare[5];
    static PoliceStation[] policeStations = new PoliceStation[11];
    static HistoricalPlace[] historicalPlaces = new HistoricalPlace[5];
    static River[] rivers = new River[5];
    static Other[] others = new Other[5];

    public static void main(String[] args) {
        initializeData();
        displayMainMenu();
        System.out.println("\nThank you for using District Management System!");
    }

    static void initializeData() {
        for (int i = 0; i < upazilas.length; i++) upazilas[i] = new Upazila();
        for (int i = 0; i < education.length; i++) education[i] = new Education();
        for (int i = 0; i < healthcare.length; i++) healthcare[i] = new Healthcare();
        for (int i = 0; i < policeStations.length; i++) policeStations[i] = new PoliceStation();
        for (int i = 0; i < historicalPlaces.length; i++) historicalPlaces[i] = new HistoricalPlace();
        for (int i = 0; i < rivers.length; i++) rivers[i] = new River();
        for (int i = 0; i < others.length; i++) others[i] = new Other();

        // Example initialization (shortened for brevity)
        upazilas[0].name = "Atghoria";
        upazilas[0].population = 157254;
        upazilas[0].area = 186.15f;
        upazilas[0].chairman = "Md.Tanvir Islam (Former)";
        upazilas[0].uno = "Md.Minhazul islam (unoatghoria@mopa.gov.bd)";
        upazilas[0].unions = "Chandba , Debotter , Ekdoanta , Laxmipur , Majhpara";

        upazilas[1].name = "Bera";
        upazilas[1].population = 157254;
        upazilas[1].area = 186.15f;
        upazilas[1].chairman = "Md.Tanvir Islam (Former)";
        upazilas[1].uno = "Md.Minhazul islam (unoatghoria@mopa.gov.bd)";
        upazilas[1].unions = "Chandba , Debotter , Ekdoanta , Laxmipur , Majhpara";

        //Education data
        education[0].name = "Pabna Medical college";
        // ... [Fill in the remaining data as in your C code, same approach]
    }

    static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWELCOME TO PABNA ZILA");
            System.out.println("=====================");
            System.out.println("1. Upazila Information");
            System.out.println("2. Education Institutions");
            System.out.println("3. Healthcare Facilities");
            System.out.println("4. Police Stations");
            System.out.println("5. Historical Places");
            System.out.println("6. Rivers of Pabna");
            System.out.println("7. Other Information");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1 -> displayUpazilas();
                case 2 -> displayEducation();
                case 3 -> displayHealthcare();
                case 4 -> displayPoliceStations();
                case 5 -> displayHistoricalPlaces();
                case 6 -> displayRivers();
                case 7 -> displayOthers();
                case 0 -> System.out.println("\nExiting program...");
                default -> System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 0);
    }

    static void displayUpazilas() {
        System.out.println("\nUPAZILA INFORMATION");
        for (int i = 0; i < upazilas.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, upazilas[i].name);
            System.out.printf("   Population: %d%n", upazilas[i].population);
            System.out.printf("   Area: %.2f sq km%n", upazilas[i].area);
            System.out.printf("   Chairman: %s%n", upazilas[i].chairman);
            System.out.printf("   UNO: %s%n", upazilas[i].uno);
            System.out.printf("   Unions: %s%n%n", upazilas[i].unions);
        }
    }

    static void displayEducation() {
        System.out.println("\nEDUCATION INSTITUTIONS");
        for (int i = 0; i < education.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, education[i].name);
            System.out.printf("   Type: %s%n", education[i].type);
            System.out.printf("   Students: %d%n", education[i].students);
            System.out.printf("   Teachers: %d%n", education[i].teachers);
            System.out.printf("   Established: %d%n", education[i].established);
            System.out.printf("   Address: %s%n%n", education[i].address);
        }
    }

    static void displayHealthcare() {
        System.out.println("\nHEALTHCARE FACILITIES");
        for (int i = 0; i < healthcare.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, healthcare[i].name);
            System.out.printf("   Doctors: %d%n", healthcare[i].doctors);
            System.out.printf("   Nurses: %d%n", healthcare[i].nurses);
            System.out.printf("   Beds: %d%n", healthcare[i].beds);
            System.out.printf("   Services: %s%n%n", healthcare[i].services);
        }
    }

    static void displayPoliceStations() {
        System.out.println("\nPOLICE STATIONS");
        for (int i = 0; i < policeStations.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, policeStations[i].name);
            System.out.printf("   Officers: %d%n", policeStations[i].officers);
            System.out.printf("   OC: %s%n", policeStations[i].oc);
            System.out.printf("   Contact: %s%n%n", policeStations[i].contact);
        }
    }

    static void displayHistoricalPlaces() {
        System.out.println("\nHISTORICAL PLACES");
        for (int i = 0; i < historicalPlaces.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, historicalPlaces[i].name);
            System.out.printf("   Era: %s%n", historicalPlaces[i].era);
            System.out.printf("   Significance: %s%n", historicalPlaces[i].significance);
            System.out.printf("   Location: %s%n%n", historicalPlaces[i].location);
        }
    }

    static void displayRivers() {
        System.out.println("\nRIVERS INFORMATION");
        for (int i = 0; i < rivers.length; i++) {
            System.out.printf("%d. Name: %s%n", i + 1, rivers[i].name);
            System.out.printf("   Area: %.2f%n", rivers[i].area);
            System.out.printf("   Address: %s%n%n", rivers[i].address);
        }
    }

    static void displayOthers() {
        System.out.println("\nOTHER INFORMATION");
        for (int i = 0; i < others.length; i++) {
            System.out.printf("%d. Category: %s%n", i + 1, others[i].category);
            System.out.printf("   Details: %s%n%n", others[i].details);
        }
    }
}





