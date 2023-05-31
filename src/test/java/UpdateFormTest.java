import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import static java.lang.Thread.sleep;

public class UpdateFormTest extends BaseTest {

    @DataProvider(name = "userData")
    public Object[][]getUserData(){
        return new Object[][]
    {
        {"malik@example.com","123456"},
        {"roxanne@example.com","123456"}
    };
    }

//   private UserData userData;
//    UserData student = new UserData("kali@gmail.com", "12ka34");//"kali@gmail.com", "12ka34"
//    UserData teacher = new UserData("van@gmail.com", "223344");

    @BeforeMethod

    public void preconditions(Object[]userData){

        new HeaderMenu().clickSignInBtn();
        new SignInPage().signIn((String)userData[0],(String)userData[1]);
        //
        new HeaderMenuStudent().clickMyProfile();

    }

    @Test(dataProvider="userData",testName="tc_udp3,tc_udp14: Change all field values in Update profile form.")
    public void changeAllFieldValues(String email, String password){
        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.fillStudUpdateProfileForm("Sasha", "sas@gmail.com","Hello World!","Hi! ");
        updateProfilePage.fillMajor("Astrology");
        updateProfilePage.changeColorBtn();

    }

//    @Test(testName="tc_udp14: Teacher role. Change all field values in Update profile form.")
//    public void changeTeachAllFieldValues(){
//        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
//        updateProfilePage.fillStudUpdateProfileForm("Picasso", "pic@gmail.com","Hi!","Hi!");
//        updateProfilePage.changeColorBtn();;
//
//
//    }


    @Test(dataProvider="userData",testName="tc_udp5,tc_udp16: Check Email field values in Update profile form.")
    public void checkEmailField(String email, String password){
        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.verifyUpdateForm();
        updateProfilePage.fillEmail("kali!12QA@gmail.com");
        updateProfilePage.clickUpdateProfileBtn();
    }

//    @Test(dataProvider="userData",testName="tc_udp16: Teacher role. Check Email field values in Update profile form.")
//    public void checkTeachEmailField(){
//        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
//        updateProfilePage.fillEmail("van!12QA@gmail.com");
//        updateProfilePage.clickUpdateProfileBtn();
//    }

    @Test(dataProvider="userData",testName="tc_udp7,tc_udp18: Student role. Add a photo in Avatar image field with Browse button.")
    public void addAPhotoAvatarField(String email, String password) {
        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
        updateProfilePage.chosePhoto();
        updateProfilePage.changeColorBtn();

    }

//    @Test(testName="tc_udp18: Teacher role. Add a photo in Avatar image field with Browse button.")
//    public void addTeachAPhotoAvatarField() {
//        UpdateProfilePage updateProfilePage = new UpdateProfilePage();
//        updateProfilePage.chosePhoto();
//        updateProfilePage.changeColorBtn();
//    }

    @AfterMethod

    public void tearDown(){
        HeaderMenuStudent headerMenuStudent= new HeaderMenuStudent();
        headerMenuStudent.clickSignOut();
    }








}
