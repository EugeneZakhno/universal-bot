package io.github.eugenezakhno.universal_test_bot.bots;

import io.github.eugenezakhno.universal_test_bot.model.TelegramBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class UniversalBotLogic extends TelegramLongPollingBot {

    TelegramBot telegramBot = new TelegramBot();
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        String chat_id = String.valueOf(update.getMessage().getChatId());
        SendMessage sendMessage = new SendMessage().setChatId(chat_id);

        if(update.getMessage().getText().equals("Привет")){
            sendMessage.setText("Привет дружище");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }

    @
    public String getBotUsername() {
        return telegramBot.getBotName();
    }

    public String getBotToken() {
        return getBotToken();
    }
}

