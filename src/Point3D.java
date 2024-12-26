import java.util.Objects;

public class Point3D {

    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setZ(int z){
        this.z = z;
    }

    public void printPoint() {
        String output = "Точка с координатами: х = " + x + ", y = " + y + ", z = " + z;
        System.out.println(output);
    }

    public Point3D movePoint(Vector3D vector) {
        return new Point3D(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return x == point3D.x && y == point3D.y && z == point3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}

