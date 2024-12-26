public class Vector3DArray {

    private int length;
    private Vector3D[] arr;

    public Vector3DArray(int length) {
        this.length = length;
        arr = new Vector3D[length];
        for (int i = 0;i < length; i++) {
            arr[i] = new Vector3D();
        }
    }


    public void setElement(int index, Vector3D vec) {
        arr[index] = vec;
    }
    public Vector3D getElement(int index) {
        return arr[index];
    }

    public int getLength() {
        return length;
    }

    public double getHighestLength() {
        double max = 0;
        for (Vector3D vect : arr) {
            if (vect.getLength() > max) max = vect.getLength();
        }
        return max;
    }
    public int getIndex(Vector3D vect) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(vect)) return i;
        }
        return -1;
    }

    public Vector3D summArray() {
        Vector3D summ = new Vector3D();
        for (Vector3D vect : arr) {
            summ = summ.sumVect(vect);
        }
        return summ;
    }

    public Vector3D combine(int[] arrInt) {
        Vector3D summ = new Vector3D();
        if (arrInt.length != arr.length) return summ;
        for (int i = 0; i < length; i++) {
            summ = summ.sumVect(arr[i].umnVect(arrInt[i]));
        }
        return summ;
    }

    public Point3D[] points(Point3D point) {
        Point3D[] pArr = new Point3D[arr.length];
        Point3D p = point;
        int i = 0;
        for (Vector3D j : arr) {
            pArr[i] = point.movePoint(j);
            point = p;
            i++;
        }
        return pArr;
    }
}