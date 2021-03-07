package io.github.eugenezakhno.universal_test_bot.model;

public class Bot {
    private String botName;
    private String botToken;

    public Bot(String botName, String botToken) {
        this.botName = botName;
        this.botToken = botToken;
    }

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
        return "Bot{" +
                "botName='" + botName + '\'' +
                ", botToken='" + botToken + '\'' +
                '}';
    }
}
