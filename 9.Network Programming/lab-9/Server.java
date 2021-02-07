import java.io.*;
import java.net.*;
import java.util.Date;

public class Server
{
    public static void main(String args[])
    {
        String messageIn;
        String messageOut;

        try {
            ServerSocket ssock = new ServerSocket(8000);
            System.out.println("Server started at " + new Date() + '\n');
            while(true)
            {
                Socket socket = ssock.accept();

                InputStreamReader inStr =
                        new InputStreamReader(socket.getInputStream());

                BufferedReader inNet = new BufferedReader(inStr);

                DataOutputStream outNet =
                        new DataOutputStream(socket.getOutputStream());

                messageIn = inNet.readLine();
                messageOut = messageIn.toUpperCase() + "\n";
                outNet.writeBytes(messageOut);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*Fayyoz Naimov*/