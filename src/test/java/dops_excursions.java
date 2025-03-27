
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Set;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.awt.Color.yellow;


public class dops_excursions {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
  @Test
  void Excursion() {
      Configuration.holdBrowserOpen = true;
      Configuration.timeout = 20000; // Устанавливаем таймаут в 20 секунд

      open("http://fstravel.com/searchexcursions");

       //Авторизация
        $("[class=v-icon-user-14]").click();
        $("[class=form__field]").setValue("testfspavelclient09@yandex.ru");
        $("[id=password]").setValue("Pavelpa42!!!");
        $("[type=submit]").click();

        //Поиск
$(byText("Страна поездки")).click();
$(byText("Россия")).click();
$(byText("Выбрать")).click();
      $("[class=calendar-popup__arrow-right]").click();
      $("[class=calendar-popup__arrow-right]").click();
      $("[class=calendar-popup__arrow-right]").click();
      $("[class=calendar-popup__arrow-right]").click();
      $(byText("12")).click();
      $(byText("13")).click();
     $(byText("Найти")).click();
      $(byText("Найти")).click();

    //Попап
      $("[class=excursion-card__content-btn]").click();
$(byText("Выбрать")).click();
      $(byText("12")).click();
      sleep(1500);
      $("[class=excursion-modal-main__buttons-btn").click();
      $("[class=excursion-modal-main__buttons-btn").click();



      //  Ждем, пока не откроется новая вкладка (макс 5 секунд)
      Selenide.Wait()
              .withTimeout(Duration.ofSeconds(5))
              .until(d -> d.getWindowHandles().size() > 1);

//  Получаем все дескрипторы вкладок
      Set<String> tabs = WebDriverRunner.getWebDriver().getWindowHandles();
      String originalTab = WebDriverRunner.getWebDriver().getWindowHandle();

//  Находим новую вкладку (не равную оригинальной)
      String newTab = tabs.stream()
              .filter(tab -> !tab.equals(originalTab))
              .findFirst()
              .orElseThrow(() -> new RuntimeException("Новая вкладка не найдена"));

//  Переключаемся на новую вкладку
      switchTo().window(newTab);

      //sleep(10000);


    //  $("[class=popmechanic-close]").click();
      $("[class=form__field]").click();
      $("[class=form__field]").setValue("Похоже получилось");

     // sleep(1000);

      $("[name=lastName]").setValue("Автотестимя");
      $("[name=firstName]").setValue("Автотестимя");
      $("[name=middleName]").setValue("Автотестимя");

      Selenide.actions()
              .sendKeys(Keys.TAB)  // Первый TAB
              .sendKeys(Keys.TAB)  // Второй TAB
              .perform();

      // Проверяем куда перешел фокус:
      System.out.println($(":focus").getAttribute("class")); // Выведет класс активного элемента

// Вводим данные:
      $(":focus").setValue("3522");

      Selenide.actions()
              .sendKeys(Keys.TAB)
              .perform();

      System.out.println($(":focus").getAttribute("class"));  // - спросить как пишется строка
      $(":focus").setValue("581929");




     // $(byText("Cерия документа")).click();
    //  $(byText("Cерия документа")).click();
    //  $(byText("Cерия документа")).setValue("425");





    //  $("[class=traveller-field]").setValue("174234");
   //   sleep(1000);




  //    $("[class=form__field]").setValue("Похоже получилось1");
    //  $(byText("Серия документа")).click();
  //$(byText("Cерия документа")).setValue("19");





  }


}

