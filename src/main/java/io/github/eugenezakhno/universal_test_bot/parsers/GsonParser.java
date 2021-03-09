package io.github.eugenezakhno.universal_test_bot.parsers;

import com.google.gson.Gson;
import io.github.eugenezakhno.universal_test_bot.model.Bot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GsonParser {
    String line;
    public Bot parse(){
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader("P2PCHELINDBANKB118876F775EED2A7C.json"))) {
                Bot bot = gson.fromJson(reader, Bot.class);
                return bot;
            } catch(IOException e){
                System.err.println("Parsing JSON error" + e.toString());
            }
        return null;

    }
}
