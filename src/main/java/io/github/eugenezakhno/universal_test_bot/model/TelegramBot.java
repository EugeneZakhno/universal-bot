package io.github.eugenezakhno.universal_test_bot.model;

import io.github.eugenezakhno.universal_test_bot.bots.UniversalBotLogic;
import io.github.eugenezakhno.universal_test_bot.dialogs.Answers;
import io.github.eugenezakhno.universal_test_bot.dialogs.Questions;

import java.util.ArrayList;
import java.util.HashMap;

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
