public class Dashboard {
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
