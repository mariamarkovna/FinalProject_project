import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderMenu;
import pages.HeaderMenuStudent;
import pages.SignInPage;
import pages.UpdateProfilePage;

import static java.lang.Thread.sleep;

public class StudentUpdateFormTest extends BaseTest {

    @BeforeMethod
    public void preconditions(){

        new HeaderMenu().clickSignInBtn();

        SignInPage signInPage = new SignInPage();
        signInPage.formIsShown();
        signInPage.validAuth("kali@gmail.com", "12ka34");
        signInPage.clickSignInButn();

        HeaderMenuStudent headerMenuStudent = new HeaderMenuStudent();
        headerMenuStudent.verifyAuthIcon();
        headerMenuStudent.clickProfileIcon();
        headerMenuStudent.verifyDropDownMenu();
        headerMenuStudent.clickMyProfileBtn();
    }


    @Test
    public void checkEmailField(){

        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.fillEmail("kali!12QA@gmail.com");
        updateProfilePage.clickUpdateProfileBtn();


    }

    @Test
    public void addAPhotoAvatarField() throws InterruptedException {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.chosePhoto();
        sleep(5000);
        updateProfilePage.changeColorBtn();
        sleep(5000);


    }

    @Test
    public void changeAllFieldValues(){
        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.fillStudUpdateProfileForm("Sasha", "sas@gmail.com","Hello World!","Hi! ");
        updateProfilePage.fillMajor("Astrology");
        updateProfilePage.clickUpdateProfileBtn();


    }






}
