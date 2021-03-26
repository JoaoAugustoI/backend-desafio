package com.desafiocielo.desafiocielo.controller;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ApiController
{
    @RequestMapping("/")
    public String index()
    {
        return "deu certo";
    }

    @RequestMapping("/api/v1/lancamento")
    public static JSONArray apiLancamento() throws IOException, ParseException
    {
        JsonController a = new JsonController();
        return a.lerJson();
    }



}
