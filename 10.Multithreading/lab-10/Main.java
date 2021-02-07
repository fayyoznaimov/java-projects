import java.io.*;
import java.net.*;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        new Main();
    }

    public Main() {


        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("MultiThreadServer started at " + new Date() + '\n');

            int clientNo = 1;

            while (true) {
                Socket socket = serverSocket.accept();

                System.out.println("Starting thread for client " + clientNo +
                        " at " + new Date() + '\n');

                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("Client " + clientNo + "'s host name is "
                        + inetAddress.getHostName() + "\n");
                System.out.println("Client " + clientNo + "'s IP Address is "
                        + inetAddress.getHostAddress() + "\n");

                HandleAClient task = new HandleAClient(socket);
                Thread t1 = new Thread(task);
                t1.start();

                clientNo++;
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }


    class HandleAClient implements Runnable {
        private Socket socket; // A connected socket


        public HandleAClient(Socket socket) {
            this.socket = socket;
        }


        public void run() {
            try {

                DataInputStream inputFromClient = new DataInputStream(
                        socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(
                        socket.getOutputStream());

                // Continuously serve the client
                while (true) {


                    for (int i = 1; i <= 10; i++) {
                        if (i == 2 || i == 3 || i == 5 || i == 7) {
                            System.out.println("Prime No.= " + i);
                        }
                        Thread.sleep(500);
                    }
                    for (int j = 1; j <= 10; j++) {
                        if (j == 4 || j == 6 || j == 8 || j == 9 || j == 10) {
                            System.out.println("Non-Prime No.= " + j);
                        }
                        Thread.sleep(500);
                    }

                }
            } catch (Exception e) {
            }

        }
    }
}
/*
* FAYYOZ NAIMOV U1910071*/