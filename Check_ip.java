import java.net.InetAddress;
import java.net.UnknownHostException;

public class Check_ip {
    public static void main(String[] args) {
        InetAddress myip = null;
        try {
            myip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your Ip address is : "+myip.getHostAddress());
    }
}
