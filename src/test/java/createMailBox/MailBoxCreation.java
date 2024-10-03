package createMailBox;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MailBoxCreation {
    @BeforeAll
    public static void openMail(){
        MailBoxCheck.openSite();
        MailBoxCheck.createMailBox();
        MailBoxCheck.changeTab();
    }
    @Test
    public void mailBoxCheck(){
        String firstNameValue="Наталия";
        String lastNameValue="Решетникова";
        String boxValue= "TestovTestTestovich1989";
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
