import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Тест "Код для JUnit5 есть на странице  SoftAssertions в разделе Wiki страницы Selenide в Github"
 *
 * @author Bulatov
 * @version 01
 */

public class JUnit5OnPageSelenideInGithub {
    @Test
    void findJUnit5OnPageSelenideInGithub() {
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("#wiki-pages-box").find(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5"));
    }
}
