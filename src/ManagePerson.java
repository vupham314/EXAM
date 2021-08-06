import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagePerson {

    private final Scanner scn = new Scanner(System.in);
    private final ArrayList<Person> people = new ArrayList<>();

    public Address createAddress(){
        System.out.print("city: ");
        String city = scn.nextLine();

        System.out.print("district: ");
        String district = scn.nextLine();

        System.out.print("ward: ");
        String ward = scn.nextLine();

        System.out.print("detailed address: ");
        String detailed = scn.nextLine();

        return new Address(city, district, ward, detailed);
    }

    public FullName createFullName(){
        System.out.print("first name: ");
        String firstName = scn.nextLine();

        System.out.print("surname: ");
        String surname = scn.nextLine();

        return new FullName(firstName, surname);
    }

    public Person createPeron(){
        System.out.print("your ID: ");
        String ID = scn.nextLine();

        FullName fullName = createFullName();

        System.out.print("job: ");
        String job = scn.nextLine();

        System.out.print("status vaccin: ");
        String status = scn.nextLine();

        System.out.print("vaccin type: ");
        String type = scn.nextLine();

        Address address = createAddress();

        return new Person(ID, fullName, job, status, type, address);
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void showAll(){
        boolean check = true;
        for (Person person : people) {
            System.out.println(person);
            System.out.println();
        }
        if(check){
            System.out.println("there are no any person");
            System.out.println();
        }
    }

    public void showByVaccinType(String type){
        boolean check = true;
        for (Person person : people) {
            if(person.getVaccinType().equalsIgnoreCase(type)){
                check = false;
                System.out.println(person);
                System.out.println();
            }
        }
        if(check){
            System.out.println("there are no any person");
            System.out.println();
        }
    }

    public void showByCity(String city){
        boolean check = true;
        for (Person person : people) {
            if(person.getAddress().getCity().equalsIgnoreCase(city)){
                System.out.println(person);
                System.out.println();
            }
        }
        if(check){
            System.out.println("there are no any person");
        }
    }

    public void sortByFirstName(){
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getFullName().getFirstName().compareToIgnoreCase(p2.getFullName().getFirstName()) > 0) {
                    return 1;
                } else {
                    if (p1.getFullName().getFirstName().compareToIgnoreCase(p2.getFullName().getFirstName()) == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

    public void sortByGroupOject(){
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getJob().compareToIgnoreCase(p2.getJob()) > 0) {
                    return 1;
                } else {
                    if (p1.getJob().compareToIgnoreCase(p2.getJob()) == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

}
