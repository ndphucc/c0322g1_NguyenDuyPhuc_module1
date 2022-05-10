package ss4_class_object.bai_tap.fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }
    public Fan(int speed,boolean on,double radius,String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if(this.on) {
            return "Speed: "+this.speed+"\nColor: "+this.color+"\nRadius: "+this.radius+"\nFan is on";
        }else {
            return "Color: "+this.color+"\nRadius: "+this.radius+"\nFan is off";
        }
    }

}
