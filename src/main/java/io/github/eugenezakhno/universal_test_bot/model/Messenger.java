package io.github.eugenezakhno.universal_test_bot.model;

public class Messenger {

    private String botName;
    private String botToken;

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

    @Override
    public String toString() {
        return "BotMessenger: " +
                "botName='" + getBotName() + '\'' +
                ", botToken='" + getBotToken();
    }
}
