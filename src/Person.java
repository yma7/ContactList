public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Person(String f, String l, String p)
    {
        firstName = f;
        lastName = l;
        phoneNumber = p;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString()
    {
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
