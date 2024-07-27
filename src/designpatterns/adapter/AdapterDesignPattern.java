package designpatterns.adapter;

interface  WebDriver {
    public  void getElement();
    public  void selectElement();
}
class  ChromeDriver implements  WebDriver{

    @Override
    public void getElement() {
        System.out.println("Get Element from ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select element from ChromeDriver");
    }
}

class IEDriver {

    public void findElement() {
        System.out.println("Find element from IEDriver");

    }

    public void clickElement() {
        System.out.println("Click element from IEDriver");

    }
}
class  WebDriverAdapter implements WebDriver{
   IEDriver ieDriver;

    public WebDriverAdapter(IEDriver ieDriver) {
        this.ieDriver = ieDriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
    ieDriver.clickElement();
    }
}
public class AdapterDesignPattern {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getElement();
        chromeDriver.selectElement();

        IEDriver ieDriver = new IEDriver();
        ieDriver.findElement();
        ieDriver.clickElement();


         //IE Driver is using Adpater
        WebDriver webDriver  = new WebDriverAdapter(ieDriver);
        webDriver.getElement();
        webDriver.selectElement();
    }
}
