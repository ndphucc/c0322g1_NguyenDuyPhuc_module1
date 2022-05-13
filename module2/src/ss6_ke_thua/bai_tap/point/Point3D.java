package ss6_ke_thua.bai_tap.point;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z;

    Point3D() {

    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x, y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float arr[] = {this.getX(), this.getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
    }
}
