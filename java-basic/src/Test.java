public class Test {
    public static void main(String[] args) {
        String individualAlias = "blue900629@jesushospital.com";
        int atSignIndex = individualAlias.indexOf("@");

        System.out.println(individualAlias.substring(0, atSignIndex));
        System.out.println(individualAlias.substring(atSignIndex + 1));
    }
}
