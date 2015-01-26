package my.path;

import org.eclipse.jetty.server.Server;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);

        SimpleHandler handler = new SimpleHandler();

        server.setHandler(handler);
        server.start();
        server.join();

    }
}
