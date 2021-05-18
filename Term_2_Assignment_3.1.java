public class Person {
    public String firstName;
    public String lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString() {
        String str = this.lastName + ", " + this.firstName;
        return str;
    }
}
