package exe_1;

import java.net.Socket;

public class InOutWrkr extends Thread{
    protected Socket clientSocket = null;

    public InOutWrkr(Socket client){
        this.clientSocket = client;
    }

    @Override
    public void run() {
        super.run();

    }
}
