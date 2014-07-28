import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

import sun.net.util.IPAddressUtil;


public class IPStuff {


        

    public static void main(String args[]) throws SocketException {
        System.out.println(displayLocalIP());
    }

    static String displayLocalIP() throws SocketException {
        String myIP = "";
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            if ((netint.getDisplayName().equals("wlan0"))
                    && IPAddressUtil.isIPv4LiteralAddress(inetAddress.getHostAddress().toString())) {
                myIP = inetAddress.getHostAddress();
            }

        }

    }
        return myIP;
    }
}




