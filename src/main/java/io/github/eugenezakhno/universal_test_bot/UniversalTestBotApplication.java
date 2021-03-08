package io.github.eugenezakhno.universal_test_bot;

import io.github.eugenezakhno.universal_test_bot.model.Bot;
import io.github.eugenezakhno.universal_test_bot.parsers.GsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversalTestBotApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversalTestBotApplication.class, args);
		GsonParser parser = new GsonParser();
		Bot bot = parser.parse();
		System.out.println("Bot " + bot.toString());
/*		try {
			TelegramBotsApi botsApi;
			//TODO DefaultBotSession - ?
			botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot((LongPollingBot) new UniversalBotLogic());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}

 */
	}
}
