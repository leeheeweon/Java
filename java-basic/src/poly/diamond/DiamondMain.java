package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA child = new Child();
        child.methodA();
        child.methodCommon();
    }
}
