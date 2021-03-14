package io.github.eugenezakhno.universal_test_bot.bots;

import io.github.eugenezakhno.universal_test_bot.model.TelegramBot;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.generics.LongPollingBot;

import java.util.logging.Logger;

public class UniversalBotLogic extends TelegramLongPollingBot {
    
    private static final Logger log = Logger.getLogger(String.valueOf(UniversalBotLogic.class));
    final int RECONNECT_PAUSE =10000;
    
    TelegramBot telegramBot = new TelegramBot();
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        String chat_id = String.valueOf(update.getMessage().getChatId());
        SendMessage sendMessage = new SendMessage().setChatId(chat_id);

        if(update.getMessage().getText().equals("Привет")){
            sendMessage.setText("Здарова дружище!");
            try {
                execute(sendMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void execute(SendMessage sendMessage) {
    }


    public String getBotUsername() {
        return telegramBot.getBotName();
    }

    public String getBotToken() {
        return telegramBot.getBotToken();
    }
    
    
    public void botConnect() {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot((LongPollingBot) this);
            log.info("TelegramAPI started. Look for messages");
        } catch (TelegramApiRequestException e) {
            log.info("Cant Connect. Pause " + RECONNECT_PAUSE / 1000 + "sec and try again. Error: " + e.getMessage());
            try {
                Thread.sleep(RECONNECT_PAUSE);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
                return;
            }
            botConnect();
        }
    }
}

