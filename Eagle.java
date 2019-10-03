public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    public void takeOff() {
    	System.out.println("taking off !");
    }
    public int ascend (int meters) {
    	System.out.println("ascend : 120 meters !");
    	return 120;
    	
    }
    @Override
    public int descend (int meters) {
    	System.out.println("descend : 20 meters !");
    	return 20;
    	
    }
   
    public void land () {
    	System.out.println("Landing !");
    }
}
