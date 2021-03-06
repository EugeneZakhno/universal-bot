package io.github.eugenezakhno.universal_test_bot.parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.eugenezakhno.universal_test_bot.model.Bot;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GsonParser {
    public Bot parse(){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try (BufferedReader reader = new BufferedReader(new FileReader("P2PCHELINDBANKB118876F775EED2A7C.json"))) {
            return gson.fromJson(reader, Bot.class);
            } catch(IOException e){
                System.err.println(" Parsing JSON error " + e.toString());
            }
        return null;

    }
}
