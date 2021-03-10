package io.github.eugenezakhno.universal_test_bot.model;

public class Bot {

    private TelegramBot telegramBot;

    public TelegramBot getTelegramBot() {
        return telegramBot;
    }

    public void setTelegramBot(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }


    @Override
    public String toString() {
        return  "TelegramBot"  + getTelegramBot();
    }
}
