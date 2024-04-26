package by.javaguru.http;

import by.javaguru.http.HttpServer;

public class HttpServerRunner {

    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer(8082,100);
        httpServer.run();
    }

}
