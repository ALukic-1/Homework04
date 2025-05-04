package h3;

public class Lamp implements Switchable, Dimmable {

    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setBrightness(int level) {
        if (on && level > 0 && level <= MAX_BRIGHTNESS) {
            brightness = level;
        } else if (level == 0) {
            brightness = 0;
                turnOff();
        } else if (!on) {
            System.out.println("Lampe ist aus.");
        } else {
            System.out.println("Ungültiger Wert");
        }

    }

    @Override
    public int getBrightness() {
        return brightness;
    }


    public void dimToHalf() {
       if (!on){
           System.out.println("Lampe ist aus");
       } else
        if (brightness  <= 1) {
            setBrightness(0);
            turnOff();
            System.out.println("Lampe wurde ausgeschaltet." );
        } else {
            setBrightness(brightness / 2);

        }
    }
}
