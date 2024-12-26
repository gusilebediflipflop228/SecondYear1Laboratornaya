import java.util.Objects;

public class Vector3D {
    private int x, y, z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3D(Point3D point1, Point3D point2) {
        this.x = point2.getX() - point1.getX();
        this.y = point2.getY() - point1.getY();
        this.z = point2.getZ() - point1.getZ();
    }

    public int getX(){ return x; }
    public int getY(){ return y; }
    public int getZ(){ return z; }
    public void setX(int x){ this.x = x; }
    public void setY(int y){ this.y = y; }
    public void setZ(int z){ this.z = z; }

    public void printVector() {
        String output = "Вектор с координатами: х = " + x + ", y = " + y + ", z = " + z;
        System.out.println(output);
    }

    public double getLength() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector3D sumVect(Vector3D vect) {
        x = x + vect.getX();
        y = y + vect.getY();
        z = z + vect.getZ();
        return this;
    }

    public Vector3D umnVect(int i) {
        x = x * i;
        y = y * i;
        z = z * i;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return x == vector3D.x && y == vector3D.y && z == vector3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

}