package statice1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("data1 = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("data2 = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("data3 = " + Data3.count);

        Data3 data4 = new Data3("D");
        System.out.println("data4.count = " + data4.count);
        System.out.println("data4.cout = " + Data3.count);
    }
}
