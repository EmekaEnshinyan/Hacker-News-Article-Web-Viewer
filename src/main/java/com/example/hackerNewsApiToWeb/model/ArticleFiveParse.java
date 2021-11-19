package com.example.hackerNewsApiToWeb.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;

import static java.lang.System.in;
//as of now this is not needed
@RestController
public class ArticleFiveParse {

    //
    //
    //TODO: this may need to be an int so can display on webpage?

}

