public class Coach extends Person {
    public String role;
    
    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }
    
    public String toString() {
        String str = super.toString() + "\n   Role: " + this.role;
        return str;
    }
}
