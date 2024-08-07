package com.prateekb.footbalApp.service;

import com.prateekb.footbalApp.config.enums.ApiRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.zip.GZIPInputStream;

@Service
public class HttpConnector {
    @Value("${api-key}")
    private String apiKey;
    @Value("${base-url}")
    private String baseUrl;

    public String sendGet(ApiRequest type, List<String> params) {
        StringBuffer buffer = new StringBuffer();
        try {
            URL url = new URL(baseUrl + getParamsBuilder(type, params));

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            InputStream rawInStream = null;
            if (connection.getResponseCode() == 200) {
                rawInStream = connection.getInputStream();
            } else {
                rawInStream = connection.getErrorStream();
            }
            InputStream dataInput;
            InputStreamReader isr = new InputStreamReader(rawInStream);
            BufferedReader in = new BufferedReader(isr);
            dataInput = new BufferedInputStream(rawInStream);

            int rc;
            while ((rc = dataInput.read()) != -1) {
                buffer.append((char) rc);
            }
            dataInput.close();
            in.close();
        } catch (Exception ex) {
            System.out.println("Exception occur due to " + ex.getLocalizedMessage());
        }
        return buffer.toString();
    }

    private String getParamsBuilder(ApiRequest requestType, List<String> params) {
        StringBuilder sb = new StringBuilder();
        String[] paramKeys = requestType.getRequestParams();
        int length = paramKeys.length;
        for (int i = 0; i < length - 1; i++) {
            if (i == 0)
                sb.append("?");
            sb.append(paramKeys[i]).append("=").append(params.get(i)).append("&");
        }
        sb.append(paramKeys[length - 1]).append("=").append(apiKey);
        return sb.toString();
    }
}
