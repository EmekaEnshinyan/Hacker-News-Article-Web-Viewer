package com.example.demo.client;

import com.example.demo.DemoApplication;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static java.lang.System.in;

public class HackerNewClient {

    Article art = new Article(UUID.randomUUID(), "mentor", "fun times", "10/20/21", "deleted", "", "", "");

    public int getArticleByKey() throws IOException {
        URL getUrl = new URL("https://hacker-news.firebaseio.com/v0/item/28902662.json?print=pretty");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();

        //setting request?
        connection.setRequestMethod("GET");
        //getting response?
        int responseCode = connection.getResponseCode();
        //shows successful connection if response 200
        if (responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader art = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonResponseData = new StringBuffer();
            String readLine = null;

            //append response line by line
            while ((readLine = art.readLine()) != null){
                jsonResponseData.append(readLine);
            }
            in.close();
            System.out.println("data appended: " + jsonResponseData.toString());
        }else{
            System.out.println(responseCode);
        }
        return responseCode;

    }
}

