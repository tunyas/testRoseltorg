package createMailBox;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MailBoxCreation {
    @Test
    public void mailBoxCheck(){
        String firstNameValue="Наталия";
        String lastNameValue="Решетникова";
        String boxValue= "TestovTestTestovich1989";
        open("https://mail.ru");
        MailBoxCheck.createMailBox();
        String originalTab = getWebDriver().getWindowHandle();
        for (String tab : getWebDriver().getWindowHandles()) {
            if (!tab.equals(originalTab)) {
                getWebDriver().switchTo().window(tab);
                break;
            }
        }
        MailBoxCheck.setNext();
        MailBoxCheck.printErrorMessages();
        MailBoxCheck.setFirstnameValue(firstNameValue);
        MailBoxCheck.setNext();
        MailBoxCheck.printErrorMessages();
        MailBoxCheck.setLastNameValue(lastNameValue);
        MailBoxCheck.setNext();
        MailBoxCheck.printErrorMessages();
        MailBoxCheck.setDayBirth();
        MailBoxCheck.setMonthBirth();
        MailBoxCheck.setYearBirth();
        MailBoxCheck.setGender();
        MailBoxCheck.setBoxValue(boxValue);
        MailBoxCheck.setNext();
        MailBoxCheck.printErrorMessages();
    }

}
