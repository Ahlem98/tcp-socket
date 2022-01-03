import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class tcpclient {
    public static void main(String[] args) throws Exception{
        String hostname ="127.0.0.1";
        int port=6500;
        while(true) {
            String message, messageModifier;
            System.out.println("please connect");
            Socket clientSocket = new Socket(hostname, port);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())), true);
            while (true) {
              //  System.out.println("1");
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

               // System.out.println("2");
                String toserver = inFromUser.readLine();

             //   System.out.println("3");
                outToServer.println(toserver);
                String msgserver=inFromServer.readLine();
                if (msgserver.equals("log")){
                    System.out.println("goodbye");
                    break;}
              System.out.println("4");
                System.out.println("from server: " + msgserver);
            }
        }
    }
}