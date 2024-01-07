import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        String apb = "BEE6A8052A1BAD5BB1E40F4C0F8B1FD2";
        String iv = "5F1F6B63AAA65002";

        String s = "gisa2";

        SecretKeySpec skeySpec = new SecretKeySpec(apb.getBytes("UTF-8"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(iv.getBytes("UTF-8")));

        byte[] encryptedData = cipher.doFinal(s.getBytes("UTF-8"));

        System.out.println(Base64.getEncoder().encodeToString(encryptedData)); ;

    }
}