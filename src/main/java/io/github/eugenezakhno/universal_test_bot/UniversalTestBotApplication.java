package io.github.eugenezakhno.universal_test_bot;

import io.github.eugenezakhno.universal_test_bot.bots.UniversalBotLogic;
import io.github.eugenezakhno.universal_test_bot.model.Bot;
import io.github.eugenezakhno.universal_test_bot.parsers.GsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class UniversalTestBotApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversalTestBotApplication.class, args);

		GsonParser parser = new GsonParser();
		Bot bot = parser.parse();
		System.out.println(bot.toString());

	    try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot((LongPollingBot) new UniversalBotLogic());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


	}
}
