import java.io.DataOutputStream;
import java.net.Socket;

public class Myclient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.43.134", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello  from Servlet 2");
            dos.flush();
            dos.close();
            s.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}