package io.github.eugenezakhno.universal_test_bot.bots;

import io.github.eugenezakhno.universal_test_bot.model.TelegramBot;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class UniversalBotLogic extends TelegramLongPollingBot {

    TelegramBot telegramBot = new TelegramBot();

    @Override
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        String chat_id = String.valueOf(update.getMessage().getChatId());
        SendMessage sendMessage = new SendMessage().setChatId(chat_id);

        if(update.getMessage().getText().equals("Привет")){
            sendMessage.setText("Привет дружище, как дела?!");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }
    @Override
    public String getBotUsername() {
        return telegramBot.getBotName();
    }

    @Override
    public String getBotToken() {
        return telegramBot.getBotToken();
    }
}

