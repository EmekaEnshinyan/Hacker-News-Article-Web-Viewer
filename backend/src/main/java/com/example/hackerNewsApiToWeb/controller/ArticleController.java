/**
 * NEED TWO EVENTS
 * 1. send GET request
 * 2. have the article parsed
 *
 */
package com.example.hackerNewsApiToWeb.controller;

import com.example.hackerNewsApiToWeb.model.Article;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static java.lang.System.in;
//heroku test
@RestController
@RequestMapping
public class ArticleController {

    @GetMapping
    //indicates that value can be requested via any http query (?name=emeka)
    public static void restTest(@RequestParam(required = false, defaultValue = "") String name){
        System.out.println("Hello, " + name + "!"); //pings localhost and returns name when ?name=[name] entered after localhost
    }
}

