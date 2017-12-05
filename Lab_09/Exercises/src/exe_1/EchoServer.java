package exe_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends Thread{
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
        }catch (IOException e){
            System.out.println("Could not listen on port: 6666");
            System.exit(-1);
        }
        Socket clientSocket1 = null;
        Socket clientSocket2 = null;
        try {
            clientSocket1 = serverSocket.accept();
            clientSocket2 = serverSocket.accept();
        }catch (IOException e){
            System.out.println("Accept failed: 6666");
            System.exit(-1);
        }
        PrintWriter out1 = new PrintWriter(clientSocket1.getOutputStream(), true);
        BufferedReader in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
        PrintWriter out2 = new PrintWriter(clientSocket2.getOutputStream(), true);
        BufferedReader in2 = new BufferedReader(new InputStreamReader(clientSocket2.getInputStream()));
        String inputLine;

        while ((inputLine = in1.readLine()) != null || (inputLine = in1.readLine()) != null){
            System.out.println(inputLine);
            if(!inputLine.equals("0")){
                out1.println(inputLine);
                out2.println(inputLine);
            }else
                break;
        }

        out1.close();
        in1.close();
        clientSocket1.close();
        out2.close();
        in2.close();
        clientSocket2.close();
        serverSocket.close();
    }
}
