package com.example.hackerNewsApiToWeb.parse;

import com.example.hackerNewsApiToWeb.model.Article;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import static java.lang.System.in;

public class Parse {
    public static void hackerNewsJsonObjectParse() throws IOException {


        //after the data is read in memory, then parse
        //the JackSon standard code to parse the data
        //this mapper is used for the request containing key/value pairs
        // For a GET request
        //creates an HTTP request/response object reference

        URL getUrl = new URL("https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty");
        //Top 500 Articles
        // https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty
        //Proxy Article
        // https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        //sets request
        connection.setRequestMethod("GET");
        //gets response
        int responseCode = connection.getResponseCode();
        //if connection (200 OK) made, data buffered
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader art = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonResponseData = new StringBuffer();
            String readLine = null;

            //appends data from response line by line
            while ((readLine = art.readLine()) != null) {
                jsonResponseData.append(readLine);
            }
            in.close();
            //try this for post request

            //checks to see if JSON data cluster was a complex object or just an array
            if (jsonResponseData.charAt(0) == '[') {
                int[] jsonArray = new ObjectMapper().readValue(jsonResponseData.toString(), int[].class);
                System.out.println("");
                System.out.print("deserialized JSON array: ");
                System.out.println(Arrays.toString(jsonArray));
            } else {
                ObjectMapper objectMapper = new ObjectMapper();
                //parses the JSON data containing key/value pairs
                Article article = objectMapper.readValue(jsonResponseData.toString(), Article.class);
                System.out.println("deserialized JSON key/value object : " + article.getBy() + " " + article.getDescendants() + " "
                        + article.getId() + " " + String.join(", ", article.getKids()) + " " + article.getScore()
                        + " " + article.getTime() + " " + article.getTitle() + " "
                        + article.getType() + " " + article.getUrl());

                //tests writing some JSON data onto .txt file
                //Defining the file name and path
                /*Path fileName = Path.of("C:\\Users\\gnier\\Documents\\hackernewsapi3\\hackernewsapi2\\demo\\src\\main\\java\\testone.txt");

                // Write into the file
                Files.writeString(fileName, article.getBy() + " " + article.getDescendants() + " "
                        + article.getId() + " " + String.join(", ", article.getKids()) + " " + article.getScore()
                        + " " + article.getTime() + " " + article.getTitle() + " "
                        + article.getType() + " " + article.getUrl());
                System.out.println();
                // Read the content of the file
                String file_content = Files.readString(fileName);
                // Print the content inside the file
                System.out.println("JSON object written to file test: " + file_content);
*/
            }

            //TODO: can possibly put the data in a hashmap and have react read from that collection
        }
    }
}