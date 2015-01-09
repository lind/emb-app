package my.path;

import org.eclipse.jetty.server.Server;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081);
        server.setHandler(new SimpleHandler());
        server.start();
        server.join();
    }
}
