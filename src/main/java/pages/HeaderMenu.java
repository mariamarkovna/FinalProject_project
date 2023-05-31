package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu {

    private static SelenideElement signInBtn = $x("/html/body/div[1]/div[1]/header/div/div/div/div/a[1]");

    public void clickSignInBtn(){
        $(signInBtn).click();
    }


}
