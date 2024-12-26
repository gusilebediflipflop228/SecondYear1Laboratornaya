public class Vector3DMain {
    public static void main(String[] args) {
        Point3D point1 = new Point3D(2,0,-3);
        Point3D point2 = new Point3D(1,3,6);
        Vector3D vector1 = new Vector3D(point1, point2);
        Vector3D vector2 = new Vector3D();
        Vector3D vector3 = new Vector3D(0,0,0);


        if(vector1.equals(vector2)) {
            System.out.println("Векторы равны");
        } else System.out.println("Векторы не равны");

        if(vector2.equals(vector3)) {
            System.out.println("Векторы равны");
        } else System.out.println("Векторы не равны");

        vector1.printVector();
        System.out.print(vector1.getLength());
    }
}