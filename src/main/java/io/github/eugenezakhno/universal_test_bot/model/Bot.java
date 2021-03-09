package io.github.eugenezakhno.universal_test_bot.model;

public class Bot {

    private TelegramBot telegramBot;
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

    public TelegramBot getTelegramBot() {
        return telegramBot;
    }

    public void setTelegramBot(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }


    @Override
    public String toString() {
        return "Bot: " +
                "botName='" + getBotName() + '\'' +
                ", botToken='" + getBotToken() +" , telegramBot " + telegramBot;
    }
}
