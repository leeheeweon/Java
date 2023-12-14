package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("AccessData.publicMethod" + publicField);
    }

    void defaultMethod() {
        System.out.println("AccessData.defaultMethod" + defaultField);
    }

    private void privateMethod() {
        System.out.println("AccessData.privateMethod" + privateField);
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        System.out.println("publicField = " + publicField);
        System.out.println("defaultField = " + defaultField);
        System.out.println("privateField = " + privateField);
    }

}
