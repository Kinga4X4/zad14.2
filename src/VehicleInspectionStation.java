import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VehicleInspectionStation {
    Queue<Vehicle> vehicles = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOptions();
            System.out.println("Wybierz opcję:");
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();

            switch (option) {
                case CREATE_AND_ADD:
                    vehicles.offer(createVehicle());
                    System.out.println("Samochód dodany do kolejki");
                    break;
                case TAKE:
                    takeVehicle();
                    break;
                case EXIT:
                    System.out.println("Do widzenia!");
                    break;
            }
        } while (option != Option.EXIT);
    }

    private void takeVehicle() {
        if (vehicles.isEmpty()) {
            System.out.println("Brak samochodów w kolejce");
        } else {
            Vehicle nextVehicle = vehicles.poll();
            System.out.print("Samochód został pobrany do przeglądu: ");
            System.out.println(nextVehicle);
        }

    }

    private Vehicle createVehicle() {
        System.out.println("Podaj typ pojazdu(motocykl, samochód osobowy, samochód ciężarowy:");
        String typ = sc.nextLine();
        System.out.println("Podaj markę pojazdu:");
        String brand = sc.nextLine();
        System.out.println("Podaj model:");
        String model = sc.nextLine();
        System.out.println("Podaj rocznik:");
        int year = sc.nextInt();
        System.out.println("Podaj przebieg/km:");
        int mileage = sc.nextInt();
        System.out.println("Podaj nr VIN:");
        String vinNumber = sc.nextLine();
        System.out.println();
        return new Vehicle(typ, brand, model, year, mileage, vinNumber);
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    private enum Option {
        EXIT(0, "Wyjdź z programu"),
        CREATE_AND_ADD(1, "Wczytaj dane pojazdu i dodaj go do kolejki"),
        TAKE(2, "Pobranie pojazdu do przeglądu");

        int option;
        String description;


        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }

        @Override
        public String toString() {
            return "Option{" +
                    "option=" + option +
                    ", description='" + description + '\'' +
                    ", option=" + option +
                    '}';
        }
    }
}
