package com.jcondori.Servicios;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class http {

    private static HttpTransport TRANSPORT;
    private static HttpRequestFactory REQ_FACTORY;
    private static final String TEST_URL = "http://rest.jcondori.com/Asistencias/v1/alternancia/detalle/70335059/A";
//    private static final JsonFactory JSON_FACTORY = new JacksonFactory();


    public static void main(String[] args) {
        try {
            http.getLogin();
//            http.getAlternanciaActiva();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static HttpTransport transport() {
        if (null == TRANSPORT) {
            TRANSPORT = new NetHttpTransport();
        }
        return TRANSPORT;
    }

    private static HttpRequestFactory reqFactory() {
        if (null == REQ_FACTORY) {
            REQ_FACTORY = transport().createRequestFactory();
        }
        return REQ_FACTORY;
    }

    private static void getAlternanciaActiva() throws IOException {
        GenericUrl url = new GenericUrl("http://rest.jcondori.com/Asistencias/v1/alternancia/detalle/70335059/A");
        HttpRequest req = reqFactory().buildGetRequest(url);
        @SuppressWarnings("unused")
        HttpResponse resp = req.execute();
        System.out.println(resp.parseAsString());
    }

    private static void getLogin() throws IOException {
        GenericUrl url = new GenericUrl("http://rest.jcondori.com/Asistencias/v1/alumno/login");
        HttpRequest req = reqFactory().buildGetRequest(url);
        HttpHeaders headers = new HttpHeaders();
        headers.set("usuario","70335059");
        headers.set("password","demo");
        req.setHeaders(headers);
        @SuppressWarnings("unused")
        HttpResponse resp = req.execute();
        System.out.println(resp.parseAsString());
    }

    private static void postSimpleJsonData() throws IOException {
        GenericUrl url = new GenericUrl(TEST_URL);
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("arg1", true);
        data.put("arg2", 45);
//        HttpContent content = new JsonHttpContent(JSON_FACTORY, data);
//        reqFactory().buildPostRequest(url, content).execute();
    }

}
