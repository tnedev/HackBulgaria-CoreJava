package RBI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

    String hostName = "192.168.1.233";
    int portNumber = 5000;
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    private PrintWriter out;
    private BufferedReader in;

    public EchoClient() throws UnknownHostException, IOException {
        Socket echoSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

        this.out = out;
        this.in = in;
    }

    public String echo(String msg) throws IOException, InterruptedException {

        String readMsg = "";

        String userInput = msg;
        try {
            this.out.println(userInput);
            readMsg = in.readLine();
            System.out.println("echo: " + readMsg);
        } catch (IOException e) {
            System.out.println("Server error");
        }
        return readMsg;
    }

    public static void main(String args[]) throws IOException, InterruptedException {
        String msg = "";
        String outMsg = "";
        EchoClient echoClient = new EchoClient();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (outMsg.equals("bye") != true) {
            msg = buffer.readLine();
            outMsg = echoClient.echo(msg);
        }
    }
}
