package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {


    public String YandexUrl = "https://yandex.com";

    public String SearchCriteria = "Selenide";

    @Test
    void selenideYandexSearchTest() {
        // Открыть google
        open(YandexUrl);

        // Ввести Selenide в поиск
        $(byName("q")).setValue(SearchCriteria)
                .pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text(SearchCriteria));
        //Тестовый комментарий для ПР   
    }
}
