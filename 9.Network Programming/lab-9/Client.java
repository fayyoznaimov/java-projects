import java.io.*;
import java.net.*;

public class Client
{
    public static void main(String[] args)
    {
        String  message = null;

        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            Socket socket = new Socket("localhost", 8000);

            DataOutputStream outNet =
                    new DataOutputStream(socket.getOutputStream());

            BufferedReader inNet =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            message = reader.readLine();
            outNet.writeBytes(message + "\n");

            message = inNet.readLine();
            socket.close();

            System.out.println("Server sent: " + message);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
} /*Fayyoz Naimov*/