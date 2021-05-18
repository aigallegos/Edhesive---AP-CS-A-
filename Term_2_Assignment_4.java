import java.lang.Comparable;

public class Dashboard implements Comparable {
 //attributes
 
 int speedometer;
 int odometer;
 String light;
 
 //constructors
 
 public Dashboard() {
    this.speedometer = 0;
    this.odometer = 0;
    this.light = "Off";
    }
    
 public Dashboard(int milesTravelled, int speed) {
     if ((milesTravelled >= 0 && milesTravelled <= 99999)&&(speed >= 0 && speed <= 100)) {
       this.odometer = milesTravelled;
       this.speedometer = speed;
       this.light = "Off";
        } else if ((milesTravelled >= 0 && milesTravelled <= 99999)&&(!(speed >= 0 && speed <= 100))){
         this.odometer = milesTravelled;
         this.speedometer = 0;
         this.light = "On";
        }
        else if ((!(milesTravelled >= 0 && milesTravelled <= 99999))&&(speed >= 0 && speed <= 100)) {
         this.odometer = 0;
         this.speedometer = speed;
         this.light = "On";
        } else {
           this.speedometer = 0;
           this.odometer = 0;
           this.light = "On";
        }     
    }
    
   //methods
    @Override
    public int compareTo(Object other) {
        Dashboard a = (Dashboard)other;
        int result;
        if(this.odometer < a.odometer) {
            result = -1;
        }
        else if(this.odometer > a.odometer) {
            result = 1;
        }
        else {
            if(this.speedometer < a.speedometer) {
                result = -1;
            }
            else if(this.speedometer > a.speedometer) {
                result = 1;
            }
            else {
                if((this.light == "Off")&&(a.light == "On")) {
                    result = -1;
                }
                else if((this.light == "On")&&(a.light == "Off")) {
                    result = 1;
                }
                else {
                    result = 0;
                }
            }
        }
        return result;
    }
    public void accelerate() {
     this.speedometer += 1;
     if (this.speedometer > 100) {
         this.speedometer = 0;
         this.light = "On";
        }
    }
    
    public void drive(int numMinutes) {
        this.odometer += ((int)((((double)numMinutes) / 60) * ((double)this.speedometer)));
        if (this.odometer > 99999) {
         this.odometer = 0;
         this.light = "On";
        }
    }
    
    public String race(Dashboard other, int acc1, int acc2) {
        String str = "";
        for(int i = 0; i < acc1; i ++) {
            this.accelerate();
        }
        for(int i = 0; i < acc2; i ++) {
            other.accelerate();
        }
        if(this.light == "On") {
            str += "First car stalled out!\n";
        }
        if(other.light == "On") {
            str += "Second car stalled out!\n";
        }
        str += "\n" + this.toString() + "\n\n" + other.toString() + "\n";
        if(this.light == "On") {
            if(other.light == "On") {
                str += "\nIt's a tie!";
            }
            else {
                str += "\nCar 2 has won the race!\n";
            }
        }
        else {
            if(other.light == "Off") {
                if (this.speedometer > other.speedometer) {
                    str += "\nCar 1 has won the race!\n";
                }
                else if (this.speedometer < other.speedometer) {
                    str += "\nCar 2 had won the race!\n";
                }
                else {
                    str += "\nIt's a tie!";
                }
            }
            else {
                str += "\nCar 1 has won the race!\n";
            }
            
        }
        return str;
    }
    
    public String difference (Dashboard other) {
        String str = "";
        int diff = 0;
        double mpm = 0;
        double time = 0;
        if(this.odometer > other.odometer) {
            diff = this.odometer - other.odometer;
            mpm = other.speedometer/60;
            time = (double)diff/mpm;
            str += "Second car will need to drive for " + time + " minutes to catch first car.\n";
        }
        if(this.odometer <= other.odometer) {
            diff = other.odometer - this.odometer;
            mpm = this.speedometer/60;
            time = (double)diff/mpm;
            str += "First car will need to drive for " + time + " minutes to catch second car.\n";
        }
        return str;
    }
    
    public String toString() {
    String distance = Integer.toString(this.odometer);
    String distance2 = "";
    int bin = 5 - distance.length();
    for (int i = 0; i < bin; i ++) {
        distance2 += "0";
    }
    distance2 += distance;
    
    String x = "";
    x += "Speedometer: ";
    x += this.speedometer;
    x += " MPH\nOdometer: ";
    x += distance2;
    x += "\nCheck Engine: ";
    x += this.light;
    return x;
    }
}
