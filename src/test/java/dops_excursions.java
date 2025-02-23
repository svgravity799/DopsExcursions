
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dops_excursions {
    //@BeforeAll
  //  static void beforeAll() { Configuration.browser = "chrome"; }
  @Test
  void Excursion() {
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 20000; // Устанавливаем таймаут в 20 секунд

      open("https://www.fstravel.com");
        $("[class=v-icon-user-14]").click();
        $("[class=form__field]").setValue("testfspavelclient@yandex.ru");
        $("[id=password]").setValue("Pavelpa42!!!");
        $("[type=submit]").click();
      $(byText("searchexcursions")).click();

       $("[class=v-chevron-right").click();
       $("[class=popularCategories__item-icon").click();

      //  $("[class=popularCategories__item-icon").click();
//$(byText("https://api.selcdn.ru/v1/SEL_50469/funandsun-cdn/84f7da10-266c-4afa-9747-d3065fc313d2.svg")).click();  //выбордаты



  }


}

