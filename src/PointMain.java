public class PointMain { //вывод точки на консоль

    public static void main(String[] args) {
        Point3D point1 = new Point3D(1,0,3);
        Point3D point2 = new Point3D();
        Point3D point3 = new Point3D(0,0,0);

        if(point1.equals(point1)) {
            System.out.println("Точка равна сама себе");
        } else System.out.println("Точка не равна сама себе");

        if(point2.equals(point3)) {
            System.out.println("Точки равны");
        } else System.out.println("Точки не равны");

        point1.printPoint();
    }
}
