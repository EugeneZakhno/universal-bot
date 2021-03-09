package io.github.eugenezakhno.universal_test_bot.model;

import io.github.eugenezakhno.universal_test_bot.dialogs.Answers;
import io.github.eugenezakhno.universal_test_bot.dialogs.Questions;

import java.util.ArrayList;

public class TelegramBot {

    private ArrayList <String> availableTransfers;
   // private HashMap <Questions, Answers> dialogsTemplates;

    public ArrayList<String> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(ArrayList<String> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }


}
