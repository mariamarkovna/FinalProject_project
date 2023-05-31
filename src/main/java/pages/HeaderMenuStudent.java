package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class HeaderMenuStudent {
    private static SelenideElement loggedInIcon= $x("//div[@class='MuiBox-root css-4tv0ih']//button[@type='button']");
    ////div[@class='MuiBox-root css-4tv0ih']//button[@type='button']
    private static SelenideElement menuProfile = $x("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']");
    private static SelenideElement myProfileBtn = $x("/html/body/div[1]/div[1]/div/div[3]/ul/a[1]");

    private static SelenideElement signOutBtn = $x("/html/body/div[1]/div[1]/div/div[3]/ul/a[2]");

    @Step("User is logged")
    public SelenideElement verifyAuthIcon() {

        return $(loggedInIcon);
    }

    @Step("Click profile icon")

    public void clickProfileIcon(){

        $(loggedInIcon).click();
    }

    @Step("Appear drop-down menu")

    public SelenideElement verifyDropDownMenu(){
        return $(menuProfile);
    }

    @Step("Click my profile button")

    public void clickMyProfileBtn(){

        $(myProfileBtn).click();
    }

    @Step("Click Sign Out button")
    public void clickSignOutBtn(){

        $(signOutBtn).click();
    }

    @Step("Click My profile")
    public void clickMyProfile(){
        verifyAuthIcon();
        clickProfileIcon();
        verifyDropDownMenu();
        clickMyProfileBtn();
    }

    @Step("Click Sign Out")
    public void clickSignOut(){
        clickProfileIcon();
        verifyDropDownMenu();
        verifyDropDownMenu();
        clickSignOutBtn();
    }

}
