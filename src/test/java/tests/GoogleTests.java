package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    void selenideSearchTest () {
        open("https://www.google.com");

        $(byName("q")).setValue("Selenide").pressEnter();
        
        $("html").shouldHave(text("Selenide"));
    }
}

class YandexTest {
    @Test
    void selenideYandexSearchTest() {
        open("https://yandex.ru/");

        $(byName("text")).setValue("selenide").pressEnter();

        $("#search-result").shouldHave(text("selenide"));
    }
}
