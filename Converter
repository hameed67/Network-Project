/**
 * Created by hameedhakimi on 3/22/17.
 */
import java.io.*;


public class Converter {

    public static byte [] convertToBytes(Object o) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(b);
        os.writeObject(o);
        return b.toByteArray();
    }

    public static Object convertToObject(byte [] bArr) throws ClassNotFoundException, IOException {
        ByteArrayInputStream b = new ByteArrayInputStream(bArr);
        ObjectInputStream os = new ObjectInputStream(b);
        return os.readObject();
    }
}
