public class UltimatePlayer extends Person {
    private static int playerNumber = 1;
    private String position;
    private int jerseyNumber;
    
    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if ((position.equals("handler"))||(position.equals("cutter"))) {
            this.position = position;
        }
        else {
            this.position = "handler";
        }
        this.jerseyNumber = playerNumber;
        playerNumber ++;
    }
    
    public String getPosition() {
        return this.position;
    }
    
    public String toString() {
        String str = super.toString() + "\n   Jersey #: " + this.jerseyNumber + "\n   Position: " + this.position;
        return str;
    }
}
