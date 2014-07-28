import java.io.IOException;
import java.net.InetAddress;

public class IPsInNetwork {

    public static void main(String[] args) throws IOException {
        System.out.println(IPStuff.displayLocalIP());
        byte[] ipAddr = new byte[] { (byte) 192, (byte) 168, (byte) 1, (byte) 0 };
        InetAddress addr = InetAddress.getByAddress(ipAddr);
        for (int i = 1; i < 255; i++) {
            ipAddr[3] = (byte) i;
            addr = InetAddress.getByAddress(ipAddr);
            // System.out.println(addr.getHostAddress());
            if (addr.isReachable(70)) {
                System.out.println(addr.getHostAddress());
            }
        }

    }

}
