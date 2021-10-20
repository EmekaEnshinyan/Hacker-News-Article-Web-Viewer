//1. From where the program begins in run-time
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static java.lang.System.in;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("YT Time Stamp (by minute): 60");
	}

	public static void getApiRequest() throws IOException {


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
	}
}


/*	public static void getApiRequest() throws IOException {

		// Get 10th record data
		URL getUrl = new URL("https://jsonplaceholder.typicode.com/posts/10");

		HttpURLConnection conection = (HttpURLConnection) getUrl.openConnection();

		// Set request method
		conection.setRequestMethod("GET");

		// Getting response code
		int responseCode = conection.getResponseCode();

		// If responseCode is 200 means we get data successfully
		if (responseCode == HttpURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			StringBuffer jsonResponseData = new StringBuffer();
			String readLine = null;

			// Append response line by line
			while ((readLine = in.readLine()) != null) {
				jsonResponseData.append(readLine);
			}

			in.close();
			// Print result in string format
			System.out.println("JSON String Data " + jsonResponseData.toString());
		} else {
			System.out.println(responseCode);
		}

	}

}*/