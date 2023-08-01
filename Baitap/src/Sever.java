import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main (String [] args) {
        int severPort =8080;

        try{
            ServerSocket severSocket = new ServerSocket(severPort);
            System.out.println("Sever is running and waiting for connection ....");

            Socket socket = severSocket.accept();
            System.out.println("Client connected");

            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte [1024];
            int bytesRead  = inputStream.read(buffer);
            String message = new String (buffer, 0 , bytesRead) ;
            System.out.println("Recieve messega form client :" +  messega);

            socket.close();
            severSocket.close();
        }catch (IOExecption e){
            e.printStackTrace();
        }
    }
}
