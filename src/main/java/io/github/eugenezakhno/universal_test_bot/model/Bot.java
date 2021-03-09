package io.github.eugenezakhno.universal_test_bot.model;

import java.util.HashMap;

public class Bot {

    private Messenger telegramBot;
    private Messenger whatsappBot;
    private Messenger viberBot;
    private Messenger facebookBot;
    private Messenger skypeBot;
    private HashMap<Questions,Answers> dialogsTemplates;

    public Messenger getTelegramBot() {
        return telegramBot;
    }

    public void setTelegramBot(Messenger telegramBot) {
        this.telegramBot = telegramBot;
    }

    public Messenger getWhatsappBot() {
        return whatsappBot;
    }

    public void setWhatsappBot(Messenger whatsappBot) {
        this.whatsappBot = whatsappBot;
    }

    public Messenger getViberBot() {
        return viberBot;
    }

    public void setViberBot(Messenger viberBot) {
        this.viberBot = viberBot;
    }

    public Messenger getFacebookBot() {
        return facebookBot;
    }

    public void setFacebookBot(Messenger facebookBot) {
        this.facebookBot = facebookBot;
    }

    public Messenger getSkypeBot() {
        return skypeBot;
    }

    public void setSkypeBot(Messenger skypeBot) {
        this.skypeBot = skypeBot;
    }

    public HashMap<Questions, Answers> getDialogsTemplates() {
        return dialogsTemplates;
    }

    public void setDialogsTemplates(HashMap<Questions, Answers> dialogsTemplates) {
        this.dialogsTemplates = dialogsTemplates;
    }
}
