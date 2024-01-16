import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList()
    {
        ArrayList<Person> contacts = new ArrayList<Person>();
    }

    public ArrayList<Person> getContacts()
    {
        return contacts;
    }

    public void addContact()
    {
        String firstName;
        String lastName;
        String phoneNumber;
        int grade;
        String sport;

        Scanner s = new Scanner(System.in);
        System.out.println("Select a type of contact to add");
        System.out.println("1: Person");
        System.out.println("2: Athlete");
        int hold = s.nextInt();
        if (hold == 1)
        {
            System.out.println("Please fill out the following information");
            System.out.println("First Name: ");
            firstName = s.nextLine();
            System.out.println("Last Name: ");
            lastName = s.nextLine();
            System.out.println("Phone Number: ");
            phoneNumber = s.nextLine();
            System.out.println("Grade: ");
            grade = s.nextInt();
            Student a = new Student(firstName, lastName, phoneNumber, grade);
            contacts.add(a);
        }
        if (hold == 2)
        {
            System.out.println("Please fill out the following information");
            System.out.println("First Name: ");
            firstName = s.nextLine();
            System.out.println("Last Name: ");
            lastName = s.nextLine();
            System.out.println("Phone Number: ");
            phoneNumber = s.nextLine();
            System.out.println("Sport: ");
            sport = s.nextLine();
            Athlete b = new Athlete(firstName, lastName, phoneNumber, sport);
            contacts.add(b);
        }
    }
    public void printContacts()
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    }

    public void sort(int sortBy)
    {
        if (sortBy == 0)
        {

        }
    }

}
