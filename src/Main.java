import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static final ManagePerson program = new ManagePerson();

    public static void menu(){
        System.out.println("""
                1: add person
                2: show all
                3: show by vaccin type
                4: show by city
                5: sort by first name
                6: sort by 
                7: exit
                """);
        System.out.print("choice: ");
        switch (Integer.parseInt(scn.nextLine())){
            case 1 -> {
                System.out.print("number of people: ");
                int number = Integer.parseInt(scn.nextLine());
                System.out.println();
                for (int i = 1; i <= number; i++) {
                    System.out.println("person 1");
                    program.addPerson(program.createPeron());
                    System.out.println();
                }
            }
            case 2 -> {
                System.out.println();
                program.showAll();
            }
            case 3 -> {
                System.out.println();
                System.out.print("enter a type of vaccin: ");
                String type = scn.nextLine();
                program.showByVaccinType(type);
            }
            case 4 -> {
                System.out.println();
                System.out.print("enter a city: ");
                String city = scn.nextLine();
                program.showByCity(city);
            }
            case 5 -> {
                System.out.println();
                program.sortByFirstName();
                program.showAll();
            }
            case 6 -> {

            }
            case 7 -> {
                return;
            }

        }
        System.out.println();
        menu();
    }

    public static void main(String[] args) {
        menu();
    }

}
