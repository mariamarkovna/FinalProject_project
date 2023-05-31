package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenuStudent {
    private static SelenideElement loggedInIcon= $x("//div[@class='MuiBox-root css-4tv0ih']//button[@type='button']");
    ////div[@class='MuiBox-root css-4tv0ih']//button[@type='button']
    private static SelenideElement menuProfile = $x("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']");
    private static SelenideElement myProfileBtn = $x("/html/body/div[1]/div[1]/div/div[3]/ul/a[1]");

    private static SelenideElement signOutBtn = $x("/html/body/div[1]/div[1]/div/div[3]/ul/a[2]");


    public SelenideElement verifyAuthIcon() {

        return $(loggedInIcon);
    }

    public void clickProfileIcon(){

        $(loggedInIcon).click();
    }

    public SelenideElement verifyDropDownMenu(){
        return $(menuProfile);
    }

    public void clickMyProfileBtn(){

        $(myProfileBtn).click();
    }

    public void clickSignOutBtn(){

        $(signOutBtn).click();
    }
}
