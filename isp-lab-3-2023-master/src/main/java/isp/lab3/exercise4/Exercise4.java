package isp.lab3.exercise4;

public class Exercise4 {
    private int x;
    private int y;
    private int z;
    public Exercise4(int x,int y,int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x=x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y=y;
    }
    public int getZ() {
        return this.z;
    }
    public void setZ(int z) {
        this.z=z;
    }

    public Exercise4() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distance(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    public double distance(Exercise4 another) {
        return distance(another.x, another.y, another.z);
    }
    public static void main(String[] args) {
        Exercise4 point1 = new Exercise4(1, 0, 0);
        Exercise4 point2 = new Exercise4(4, 0, 0);
        double distance = point1.distance(point2);
        System.out.println("The distance between " + point1 + " and " + point2 + " is " + distance);
    }
}
