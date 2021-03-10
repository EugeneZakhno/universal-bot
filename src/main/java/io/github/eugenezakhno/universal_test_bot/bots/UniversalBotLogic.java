package io.github.eugenezakhno.universal_test_bot.bots;

import io.github.eugenezakhno.universal_test_bot.model.TelegramBot;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class UniversalBotLogic extends TelegramLongPollingBot {

    TelegramBot telegramBot;

   @Override
    public void onUpdateReceived(Update update) {
       if (update.hasMessage() && update.getMessage().hasText()) {
           SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                   .setChatId(update.getMessage().getChatId())
                   .setText(update.getMessage().getText());
           try {
               execute(message); // Call method to send the message
           } catch (TelegramApiException e) {
               e.printStackTrace();
           }
       }
    }

    private void execute(SendMessage message) {
    }

    @Override
    public String getBotUsername() {
            return telegramBot.getBotName() ;

    }

    @Override
    public String getBotToken() {
        return telegramBot.getBotToken();
    }


}

