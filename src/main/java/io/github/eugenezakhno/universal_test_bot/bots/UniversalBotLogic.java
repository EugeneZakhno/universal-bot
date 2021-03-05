package io.github.eugenezakhno.universal_test_bot.bots;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.io.FileReader;
import java.io.IOException;

public class UniversalBotLogic extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // TODO
    }

    @Override
    public String getBotUsername() {
        // TODO
        try(FileReader reader = new FileReader("note.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String botName= ;
        return botName;
    }

    @Override
    public String getBotToken() {
        // TODO
        return null;
    }
}

