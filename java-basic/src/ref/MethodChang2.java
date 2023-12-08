package ref;

public class MethodChang2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value = 10;
        System.out.println("a = " + a.value);
        changePrimitive(a);
        System.out.println("a = " + a.value);
    }

    public static void changePrimitive(Data x) {
        x.value = 20;
    }

}
