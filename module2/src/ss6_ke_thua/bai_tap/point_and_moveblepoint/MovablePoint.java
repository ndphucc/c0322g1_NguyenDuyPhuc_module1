package ss6_ke_thua.bai_tap.point_and_moveblepoint;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr= {this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+"),speed=("+this.xSpeed+","+this.ySpeed+")";
    }
    public MovablePoint move() {
        this.x+=xSpeed;
        this.y+=ySpeed;
        return this;
    }
}
