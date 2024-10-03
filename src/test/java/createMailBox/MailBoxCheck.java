package createMailBox;
import static createMailBox.MainPage.*;

public class MailBoxCheck {
    public static void createMailBox(){
        createMail.click();
    }
    public static void setNext(){
        nextBtn.click();
    }
    public static void setFirstnameValue(String firstNameValue){
        fnameInput.click();
        fnameInput.setValue(firstNameValue);
    }
    public static void setLastNameValue(String lastNameValue){
        lnameInput.click();
        lnameInput.setValue(lastNameValue);
    }
    public static void setDayBirth(){
        dayInput.click();
        daySelect.click();
    }
    public static void setMonthBirth(){
        monthInput.click();
        monthSelect.click();
    }
    public static void setYearBirth(){
        yearInput.click();
        yearSelect.click();
    }
    public static void setGender(){
        femaleBtn.click();
        femaleBtn.click();
    }
    public static void setBoxValue(String boxValue){
        boxName.click();
        boxName.setValue(boxValue);
    }
    public static void printErrorMessages() {
        if (errorMessage1.exists()) {
            String errorMessage =errorMessage1.getText();
            String fieldName =fieldName1.getText();
            System.out.println("Ошибка в поле: " + fieldName + " - "  + errorMessage);
        }
        if (errorMessage2.exists()) {
            String fieldName =fieldName2.getText();
            String errorMessage =errorMessage2.getText();
            System.out.println("Ошибка в поле: " + fieldName + " - " + errorMessage);
        }
        if (errorMessage3.exists()) {
            String fieldName =fieldName3.getText();
            String errorMessage =errorMessage3.getText();
            System.out.println("Ошибка в поле: " + fieldName + " - "  + errorMessage);
        }
        if (errorMessage4.exists()) {
            String errorMessage =errorMessage4.getText();
            System.out.println("Ошибка: " + errorMessage);
        }
        if (errorMessage5.exists()) {
            String fieldName =fieldName4.getText();
            String errorMessage =errorMessage5.getText();
            System.out.println("Ошибка в поле: " + fieldName + " - "  + errorMessage);
        }
        if (errorMessage6.exists()) {
            String fieldName =fieldName5.getText();
            String errorMessage =errorMessage6.getText();
            System.out.println("Ошибка в поле: " + fieldName + " - "  + errorMessage);
        }
    }
}