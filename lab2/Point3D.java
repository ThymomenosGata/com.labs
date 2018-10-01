public class Point3D {

    private double xCoord;
    private double yCoord;
    private double zCoord;

    Point3D(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public Point3D() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    boolean equals(Point3D point3d) {
        if (this.xCoord == point3d.xCoord) {
            if (this.yCoord == point3d.yCoord) {
                if (this.zCoord == point3d.zCoord) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    double distanceTo(Point3D point) {
        return Math.sqrt(
                Math.pow((point.xCoord - this.xCoord), 2) +
                        Math.pow((point.yCoord - this.yCoord), 2) +
                        Math.pow((point.zCoord - this.zCoord), 2));
    }

}