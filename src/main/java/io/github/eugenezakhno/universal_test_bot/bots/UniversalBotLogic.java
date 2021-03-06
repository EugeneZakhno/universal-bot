package io.github.eugenezakhno.universal_test_bot.bots;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UniversalBotLogic extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // TODO
    }

    @Override
    public String getBotUsername() {
        String line;
        // TODO поменять эту логику считывания файла
        try (BufferedReader reader = new BufferedReader(new FileReader("./universal_test_bot/src/main/resources/files/config-bot.json"))) {
            while ((line = reader.readLine()) != null) {
                if (line==true) {

                }
                 }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return botName;
    }

    @Override
    public String getBotToken() {
        // TODO
        return null;
    }
}

