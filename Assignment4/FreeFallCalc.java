public class FreeFallCalc {
    public static void main(String [] args) {
        double accel = -9.81;
        double velocity = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Velocity at second " + i + " is " + velocity);
            velocity += accel;
        }
    }
}