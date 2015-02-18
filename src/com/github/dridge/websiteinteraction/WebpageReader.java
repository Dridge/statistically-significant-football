package com.github.dridge.websiteinteraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class WebPageReader {
	
    public String getWebPageDetail(String urlToGet) throws IOException {
    	/*Re-used an example taken from stack overflow
    	http://stackoverflow.com/questions/5232535/read-data-from-webpage*/
        String line = null;
        URL url = new URL(urlToGet);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn
                .getInputStream()));
        while (rd.readLine() != null) {
            line += rd.readLine();
        }
        return line;

    }
    
}
