package com.jcondori.Servicios;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;

public class HttpPost {

    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

    public static void main(String[] args) {
        HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
        try {
            String url_base = "https://dbdesarrollounis-a523158.db.us2.oraclecloudapps.com/apex/HistoricosHCM/HISTORICOS";
            String body = "{\n" +
                    "    \"accountnumber\": \"asdasdasd\",\n" +
                    "    \"personnumber\": 2,\n" +
                    "    \"salaryamount\": 0\n" +
                    "}";


            HttpContent content = new ByteArrayContent("application/json", body.getBytes());

            HttpRequest request = requestFactory.buildPostRequest(new GenericUrl(url_base), content);

            HttpResponse response = request.execute();

            System.out.println("Received response code: " + String.valueOf(response.getStatusCode()) + " - Received response: " + response.getStatusMessage());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
