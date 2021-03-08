package io.github.eugenezakhno.universal_test_bot.parsers;

import com.google.gson.Gson;
import io.github.eugenezakhno.universal_test_bot.model.Bot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonParser {
    String line;
    public Bot parse(){
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader("P2PCHELINDBANKB118876F775EED2A7C.json"))){
            while ((line = reader.readLine()) != null) {
              //  String json_string = "{\"botName\":\"Tom\", \"botToken\": \"Broody\"}";
                Bot bot = gson.fromJson(line, Bot.class);
             //   Bot bot1 = gson.fromJson(json_string, Bot.class);
                return bot;
                }
            } catch (IOException e) {
            System.err.println("Parsing JSON error" + e.toString());
        }
        return null;
    }
}
