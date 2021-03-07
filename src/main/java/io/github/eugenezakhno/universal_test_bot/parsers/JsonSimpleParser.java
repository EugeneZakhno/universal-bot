package io.github.eugenezakhno.universal_test_bot.parsers;


import io.github.eugenezakhno.universal_test_bot.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonSimpleParser {
    public Root parse(){
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try (BufferedReader reader = new BufferedReader(new FileReader("./universal_test_bot/src/main/resources/files/config-bot.json"))){
        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
        String botName = (String) rootJsonObject.get("botName");

        root.setName(name);
        return root;

        } catch (IOException | ParseException e) {
            System.err.println("Parsing error" + e.toString());
        }

        return null;
    }

}
