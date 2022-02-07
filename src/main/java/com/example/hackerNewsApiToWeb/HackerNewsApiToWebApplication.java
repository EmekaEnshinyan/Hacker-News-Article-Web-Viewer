//TODO: The lines of code that are not understood have a numbered comment on its corresponding line
//heroku app: https://evening-escarpment-16296.herokuapp.com/ | https://git.heroku.com/evening-escarpment-16296.git
package com.example.hackerNewsApiToWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.*;

import static com.example.hackerNewsApiToWeb.parse.Parse.hackerNewsJsonObjectParse;

@SpringBootApplication
public class HackerNewsApiToWebApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(HackerNewsApiToWebApplication.class, args);

		hackerNewsJsonObjectParse();
	}


//web: java -jar target/HackerNews-API-Design-Back-End-1.0.jar
}
