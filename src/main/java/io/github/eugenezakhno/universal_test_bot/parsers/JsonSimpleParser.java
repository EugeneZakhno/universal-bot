package io.github.eugenezakhno.universal_test_bot.parsers;


import io.github.eugenezakhno.universal_test_bot.model.Bot;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonSimpleParser {
    public Bot parse(){
        Bot Bot = new Bot("@TestTransferBot", "" );
        JSONParser parser = new JSONParser();
        try (BufferedReader reader = new BufferedReader(new FileReader("./universal_test_bot/src/main/resources/files/config-bot.json"))){
        JSONObject BotJsonObject = (JSONObject) parser.parse(reader);
        String botName = (String) BotJsonObject.get("botName");
        Bot.setBotName(botName);
        return Bot;
        } catch (IOException | ParseException e) {
            System.err.println("Parsing error" + e.toString());
        }

        return null;
    }

}
