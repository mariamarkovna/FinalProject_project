package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

public class UpdateProfilePage {

    private static SelenideElement updateForm = $x("//div[contains(@class,'form-box sw-background-color-ffffff sw-border-style-none sw-border-width-none sw-border-color-eaeced sw-border-radius-2xl sw-box-shadow-none ']");

    private static SelenideElement roleInputField = $x("\t//div[@class='filter-option-inner-inner']");
    private static SelenideElement roleForm = $x("//div[@class='dropdown-menu show']");
    private static SelenideElement studentRole = $x("//a[@id='bs-select-1-1']");
    private static SelenideElement fullNameInputField = $x("//input[@id='sw-form-capture-full_name-input']");
    private static SelenideElement emailInputField = $x("//input[@id='sw-form-capture-email-input']");
    private static SelenideElement aboutMeInputField = $x("\t//textarea[@id='sw-form-capture-About']");
    private static SelenideElement avatarImageInputField = $x("//input[@type='file']");
    private static SelenideElement enternalProfileInputField = $x("//input[@id='sw-form-capture-External Profile URL']");
    private static SelenideElement MajorInputField = $x("//input[@id='sw-form-capture-Major']");
    private static SelenideElement updateProfileBtn = $x("//a[@id='sw-update-profile-btn']");


    public SelenideElement verifyUpdateForm() {
        return $(updateForm);
    }

    public SelenideElement verifyRoleForm() {
        return $(roleForm);
    }

    public SelenideElement choseARole(){

        $(roleInputField).click();
        verifyRoleForm();
        $(studentRole).click();
        return null;
    }




    public void fillStudUpdateProfileForm(String fullName,String email, String aboutMe,String enternalProfile) {
        choseARole();
        $(fullNameInputField).val(fullName);
        fillEmail(email);
        $(aboutMeInputField).val(aboutMe);
        chosePhoto();
        $(enternalProfileInputField).val(enternalProfile);


    }

    public void fillEmail(String email) {
        $(emailInputField).click();
        $(emailInputField).val(email);
    }

    public void chosePhoto() {
        //$(avatarImageInputField).click();
        SelenideElement photoInput= $(avatarImageInputField);
        String filePath = "C:/Users/maria/Desktop/для даны/frozen.jpg";
        photoInput.sendKeys(filePath);

    }

    public void fillMajor(String major) {
        $(MajorInputField).click();
        $(MajorInputField).val(major);
    }


    public void clickUpdateProfileBtn() {
        $(updateProfileBtn).click();
    }
    public void changeColorBtn() {
        //$(avatarImageInputField).click();
        SelenideElement button= $(updateProfileBtn);
        String colorOfButton = button.getCssValue("background-color:#2c2921");
        clickUpdateProfileBtn();
        button.shouldNotHave(Condition.attribute("background-color:#2c2921",colorOfButton));
    }
}
