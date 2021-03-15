package io.github.eugenezakhno.universal_test_bot.model;

import java.util.ArrayList;


public class TelegramBot {

    private String botName;
    private String botToken;
    private ArrayList <String> availableTransfers;



    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotToken() {
        return botToken;
    }

    public void setBotToken(String botToken) {
        this.botToken = botToken;
    }


    public ArrayList<String> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(ArrayList<String> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }


    @Override
    public String toString() {
        return "Bot: " +
                "botName= " + getBotName() + " " +
                ", botToken=" + getBotToken() +
                ", availableTransfers= " + getAvailableTransfers();
    }
}
