public class Vector3DProcessorMain {
    public static void main(String[] args){
        Vector3D Vector1 = new Vector3D(2, 5,3);
        Vector3D Vector2 = new Vector3D(2, 5,3);
        Vector3D Vector3 = new Vector3D(1,1,1);
        Vector3DProcessor.vectorSum(Vector1, Vector3).printVector();
        Vector3DProcessor.vectorRaznost(Vector1, Vector3).printVector();
        System.out.println(Vector3DProcessor.vectorScal(Vector1, Vector3));
        Vector3DProcessor.vectorVect(Vector1, Vector3).printVector();
        System.out.println(Vector3DProcessor.vectorColl(Vector1, Vector2));
        System.out.println(Vector3DProcessor.vectorColl(Vector1, Vector3));
    }

}