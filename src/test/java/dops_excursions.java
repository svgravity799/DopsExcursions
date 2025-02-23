
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class dops_excursions {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
  @Test
  void Excursion() {
      Configuration.holdBrowserOpen = true;
      Configuration.timeout = 20000; // Устанавливаем таймаут в 20 секунд

      open("https://www.fstravel.com/searchexcursions");

      //  if ($("[class=popmechanic-reset]").isDisplayed()) { // закрытие рекламного баннера
      //  $("[class=кpopmechanic-close]").click();
  //}

        $("[class=v-icon-user-14]").click();
        $("[class=form__field]").setValue("testfspavelclient@yandex.ru");
        $("[id=password]").setValue("Pavelpa42!!!");
        $("[type=submit]").click();
$(byText("Страна поездки")).click();
$(byText("Россия")).click();
$(byText("Выбрать")).click();
      $("[class=calendar-popup__arrow-right").click();
      $("[class=calendar-popup__arrow-right").click();
      $("[class=calendar-popup__arrow-right").click();
      $("[class=calendar-popup__arrow-right").click();
      $(byText("12")).click();
      $(byText("13")).click();
      $(byText("Найти")).click();
      $("[class=excursion-card__content-btn]").click();
$(byText("Выбрать")).click();
      $(byText("12")).click();
      $("[class=excursion-modal-main__buttons-btn").click();
      $("[class=excursion-modal-main__buttons-btn").click();
//$(byText("Адрес проживания на курорте")).setValue("Автотесты 17");
//$("[id=password]").setValue("Pavelpa42!!!");
      $("[class=v-icon-user-14]").click();

      //   $(byText("searchexcursions")).click();

    //   $("[class=v-chevron-right").click();
     //  $("[class=popularCategories__item-icon").click();

      //  $("[class=popularCategories__item-icon").click();
//$(byText("https://api.selcdn.ru/v1/SEL_50469/funandsun-cdn/84f7da10-266c-4afa-9747-d3065fc313d2.svg")).click();  //выбордаты



  }


}

