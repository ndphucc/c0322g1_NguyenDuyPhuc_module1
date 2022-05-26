package ss15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_lop_IllegalTriangleException;

public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3) throws IllegalRightTriangleException {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            throw new IllegalRightTriangleException("Đây không phải 3 cạnh của tam giác");
        } else if (edge1 + edge2 < edge3 || edge2 + edge3 < edge1 || edge1 + edge3 < edge2) {
            throw new IllegalRightTriangleException("Đây không phải 3 cạnh của tam giác");
        } else {
            this.edge1 = edge1;
            this.edge2 = edge2;
            this.edge3 = edge3;
        }
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public String toString() {
        return "Triangle{" +
                "edge1=" + edge1 +
                ", edge2=" + edge2 +
                ", edge3=" + edge3 +
                '}';
    }
}
