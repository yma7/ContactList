import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList()
    {
        contacts = new ArrayList<Person>();
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
        System.out.println("1: Student");
        System.out.println("2: Athlete");
        int hold = s.nextInt();
        s.nextLine();
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

    public void sort(int sortBy) {
        Person p;
        int number;
        if (sortBy == 0)
        {
            int n = contacts.size();
            for (int pass = 1; pass < n; pass++)
            {
                for (int comp = 0; comp < n - pass; comp++)
                {
                    if (contacts.get(comp).getFirstName().compareTo(contacts.get(comp + 1).getFirstName()) > 0)
                    {
                        p = contacts.get(comp);
                        contacts.set(comp, contacts.get(comp + 1));
                        contacts.set(comp + 1, p);
                    }
                }
            }
            printContacts();
        }
        else if (sortBy == 1)
        {
            int n = contacts.size();
            for (int pass = 1; pass < n; pass++)
            {
                for (int comp = 0; comp < n - pass; comp++)
                {
                    if (contacts.get(comp).getLastName().compareTo(contacts.get(comp + 1).getLastName()) > 0)
                    {
                        p = contacts.get(comp);
                        contacts.set(comp, contacts.get(comp + 1));
                        contacts.set(comp + 1, p);
                    }
                }
            }
            printContacts();
        }
        else
        {
            int n = contacts.size();
            for (int pass = 1; pass < n; pass++)
            {
                for (int comp = 0; comp < n - pass; comp++)
                {
                    if (contacts.get(comp).getPhoneNumber().compareTo(contacts.get(comp + 1).getPhoneNumber()) > 0)
                    {
                        p = contacts.get(comp);
                        contacts.set(comp, contacts.get(comp + 1));
                        contacts.set(comp + 1, p);
                    }
                }
            }
            printContacts();
        }
    }
    public Person searchByFirstName(String firstName)
    {
        for (Person K: contacts)
        {
            if (K.getFirstName().equals(firstName))
            {
                return K;
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName)
    {
        for (Person K: contacts)
        {
            if (K.getLastName().equals(lastName))
            {
                return K;
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber)
    {
        for (Person K: contacts)
        {
            if (K.getPhoneNumber().equals(phoneNumber))
            {
                return K;
            }
        }
        return null;
    }
    public void listStudents()
    {
        for (Person contact: contacts)
        {
            if (contact instanceof Student)
            {
                System.out.println(contact);
            }
        }
    }
    private void printMenu()
    {
        System.out.println("Menu:");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Name");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search By Phone Number");
        System.out.println("0. Exit");

    }
    public void Run()
    {
        int options;
        String holder;
        Scanner scanner = new Scanner(System.in);
        do
        {
            printMenu();
            options = scanner.nextInt();
            scanner.nextLine();
            {
                {
                    switch(options)
                    {
                        case 1:
                            addContact();
                            break;
                        case 2:
                            sort(0);
                            break;
                        case 3:
                            sort(1);
                            break;
                        case 4:
                            sort(2);
                            break;
                        case 5:
                            listStudents();
                            break;
                        case 6:
                            System.out.println("First Name: ");
                            holder = scanner.nextLine();
                            System.out.println(searchByFirstName(holder));
                            break;
                        case 7:
                            System.out.println("Last Name:");
                            holder = scanner.nextLine();
                            System.out.println(searchByLastName(holder));
                            break;
                        case 8:
                            System.out.println("Phone Number");
                            holder = scanner.nextLine();
                            System.out.println(searchByPhoneNumber(holder));
                            break;
                    }
                }
            }
        }
        while (options != 0);
    }

    public static void main(String[] args)
    {
        ContactList Kavan = new ContactList();
        Kavan.Run();
    }
}
