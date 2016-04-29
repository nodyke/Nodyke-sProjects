import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Nodyke on 29.04.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File("enc"));


        byte[] arr = new byte[50000];


        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(inputStream);
        FileOutputStream outputStream = new FileOutputStream(new File("pic.jpg"));
        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();
    }
}
