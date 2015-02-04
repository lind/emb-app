package my.path;

import org.eclipse.jetty.server.Server;

public class SimpleServer {

    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(args[0]);
        Server server = new Server(port);

        SimpleHandler handler = new SimpleHandler();

        server.setHandler(handler);
        server.start();
        server.join();

    }
}
