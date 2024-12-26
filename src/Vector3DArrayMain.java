public class Vector3DArrayMain {
    public static void main(String[] args) {
        Vector3DArray arr = new Vector3DArray(5);
        Vector3D vector1 = new Vector3D(1, 2, 3);
        Vector3D vector2 = new Vector3D(1, 1, 1);
        int[] intarr = {2, 2, 2, 2, 2};
        Point3D point = new Point3D(2, 2, 2);
        System.out.println(arr.getLength());
        arr.setElement(3, vector1);
        arr.setElement(4, vector2);
        System.out.println(arr.getHighestLength());
        System.out.println(arr.getIndex(vector1));
        arr.summArray().printVector();
        arr.combine(intarr).printVector();
        //ws
        System.out.println("-----------------------------------Массив векторов, на которые сдвигаем---------------------------------------------");
        for (int i = 0; i < arr.getLength(); i++) {
            arr.getElement(i).printVector();
        }
        System.out.println("-------------------------------------Массив точек, который получаем-------------------------------------------------");
        for (int i = 0; i < arr.points(point).length; i++) {
            arr.points(point)[i].printPoint();
        }
    }
}