package createMailBox;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement createMail = $x ("//a[text()='Создать почту']");
    public static SelenideElement fnameInput = $x ("//input[@name='fname']");
    public static SelenideElement lnameInput = $x ("//input[@name='lname']");
    public static SelenideElement dayInput = $x ("//span[text()='День']");
    public static SelenideElement daySelect = $x ("//span[text()='10']");
    public static SelenideElement monthInput = $x ("//span[text()='Месяц']");
    public static SelenideElement monthSelect = $x ("//span[text()='Май']");
    public static SelenideElement yearInput = $x ("//span[text()='Год']");
    public static SelenideElement yearSelect = $x ("//span[text()='1989']");
    public static SelenideElement femaleBtn = $x ("//input[@value='female']/parent::div");
    public static SelenideElement boxName = $x ("//input[@name='partial_login']");
    public static SelenideElement nextBtn = $x ("//span[text()='Далее']/parent::button");
    public static SelenideElement errorMessage1 = $x ("//small[text()='Укажите имя']");
    public static SelenideElement errorMessage2 = $x ("//small[text()='Укажите фамилию']");
    public static SelenideElement errorMessage3 = $x ("//small[text()='Укажите дату рождения']");
    public static SelenideElement errorMessage4 = $x ("//small[text()='Укажите ваш пол']");
    public static SelenideElement errorMessage5 = $x ("//small[text()='Укажите желаемое имя ящика']");
    public static SelenideElement errorMessage6 = $x ("//small[text()='Укажите телефон']");
    public static SelenideElement fieldName1 = $x ("//label[text()='Имя']");
    public static SelenideElement fieldName2 = $x ("//label[text()='Фамилия']");
    public static SelenideElement fieldName3 = $x ("//label[text()='Дата рождения']");
    public static SelenideElement fieldName4 = $x ("//label[text()='Имя ящика']");
    public static SelenideElement fieldName5 = $x ("//label[text()='Номер телефона']");

}
