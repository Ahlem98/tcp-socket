import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class server {
    public static List<compte> comptes;
    static int c;

    public static void main(String[] args) throws IOException {
        comptes=new ArrayList<compte>();
        ServerSocket serverSocket=new ServerSocket(6500);
        while (true){
            Socket s=serverSocket.accept();
            traitement traitement=new traitement(s);
            traitement.start();
        }
    }
}
