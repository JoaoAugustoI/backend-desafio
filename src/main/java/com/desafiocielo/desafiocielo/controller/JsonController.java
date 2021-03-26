package com.desafiocielo.desafiocielo.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.springframework.util.ResourceUtils;

public class JsonController
{
    public JSONArray lerJson() throws IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader("src/main/resources/static/lancamento-conta-legado.json"));

        return a;
        //Object obj = new JSONParser().parse(new FileReader("src/main/resources/static/lancamento-conta-legadoteste.json"));

        // typecasting obj to JSONObject
        //JSONObject jo = (JSONObject) obj;
        //String firstName = (String) jo.get("data_lancamento");

        //System.out.print(a);
        /*
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("src/main/resources/static/lancamento-conta-legadoteste.json"))
        {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("numero");
            System.out.println(name);


            /* loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }*/

        //} catch (IOException e) {
        //    e.printStackTrace();
        //} catch (ParseException e) {
        //    e.printStackTrace();
        //}


    }

}
