package io.github.eugenezakhno.universal_test_bot;

import io.github.eugenezakhno.universal_test_bot.bots.UniversalBotLogic;
import io.github.eugenezakhno.universal_test_bot.model.Bot;
import io.github.eugenezakhno.universal_test_bot.parsers.GsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class UniversalTestBotApplication {
	public static void main(String[] args) {
		SpringApplication.run(UniversalTestBotApplication.class, args);

		GsonParser parser = new GsonParser();
		Bot bot = parser.parse();
		System.out.println(bot.toString());

		ApiContextInitializer.init();
		UniversalBotLogic universalBotLogic = new UniversalBotLogic();
		universalBotLogic.botConnect();
	}
}
