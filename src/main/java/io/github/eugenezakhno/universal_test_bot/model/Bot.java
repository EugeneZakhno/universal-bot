package io.github.eugenezakhno.universal_test_bot.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class Bot {
    @SerializedName("botName")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return Objects.equals(botName, bot.botName) &&
                Objects.equals(botToken, bot.botToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(botName, botToken);
    }

    @Override
    public String toString() {
        return "Bot: " +
                "botName='" + getBotName() + '\'' +
                ", botToken='" + getBotToken() + '\'';
    }
}
