public class Vector3DProcessor {
    public static Vector3D vectorSum(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(
                vector1.getX() + vector2.getX(),
                vector1.getY() + vector2.getY(),
                vector1.getZ() + vector2.getZ());
    }

    public static Vector3D vectorRaznost(Vector3D v1, Vector3D v2) {
        return new Vector3D(
                v1.getX() - v2.getX(),
                v1.getY() - v2.getY(),
                v1.getZ() - v2.getZ());
    }

    public static double vectorScal(Vector3D v1, Vector3D v2) {
        return Math.sqrt(v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ());
    }

    public static Vector3D vectorVect(Vector3D v1, Vector3D v2) {
        int x1 = v1.getX();
        int y1 = v1.getY();
        int z1 = v1.getZ();
        int x2 = v2.getX();
        int y2 = v2.getY();
        int z2 = v2.getZ();
        return new Vector3D(
                y1 * z2 - y2 * z1,
                z1 * x2 - z2 * x1,
                x1 * y2 - y1 * x2);
    }

    public static boolean vectorColl(Vector3D v1, Vector3D v2) {
        int x1 = v1.getX();
        int y1 = v1.getY();
        int z1 = v1.getZ();
        int x2 = v2.getX();
        int y2 = v2.getY();
        int z2 = v2.getZ();
        return x1 / x2 == y1 / y2 && x1 / x2 == z1 / z2;
    }
}
