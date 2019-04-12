public class Vehicle {
    //attributes
    public int location;
    //constructor
    //methods
    public Vehicle() {
        this.location = 0;
    }
    public Vehicle(int loc) {
        if ((loc >= -20)&&(loc <= 20)) {
            this.location = loc;
        }
        else {
            this.location = 0;
        }
    }
    public void forward() {
        if (this.location < 20) {
            this.location ++;
        }
    }
    public void backward() {
        if (this.location > -20) {
            this.location --;
        }
    }
    public int getLocation() {
        return this.location;
    }
    public String toString() {
        String x = "";
        for (int i = -20; i < this.location; i ++) {
            x += " ";
        }
        x += "@";
        return x;
    }
}
