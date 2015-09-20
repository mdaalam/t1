import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/19/15.
 */
public class GetAQuote extends Base {

    @Test

    public void togetaquote(){
        clickByCss("#insurancetype");
        typeByCss("#zip", "11103");
        clickByCss("#submitButton");
        typeByXpath(".//*[@id='CustomerForm:firstName']", "PNT");
        typeByXpath(".//*[@id='CustomerForm:lastName']","PNT");
        typeByXpath(".//*[@id='CustomerForm:customerMailingAddress']","32-72 Steinway Street");
        typeByXpath(".//*[@id='CustomerForm:unitNumber']","1");
        typeByXpath(".//*[@id='CustomerForm:mailingZip']","11103");
        typeByXpath(".//*[@id='CustomerForm:birthMonth']","12");
        typeByXpath(".//*[@id='CustomerForm:birthDay']","20");
        typeByXpath(".//*[@id='CustomerForm:birthYear']", "1990");
        clickByXpath(".//*[@id='CustomerForm:fqUnmarriedDriver:1']");
        //clickByXpath(".//*[@id='CustomerForm:fqUnmarriedDriver:0']"); //For Yes Option
        //  2ND TAB
        clickByXpath(".//*[@id='CustomerForm:continueBtn']");
        clickByXpath(".//*[@id='VehicleForm:year']/option[text() = '2015']");//Can we make a method for this line
        clickByXpath(".//*[@id='VehicleForm:make']/option[text() = 'Infiniti']");
        clickByXpath(".//*[@id='VehicleForm:model']/option[text() = 'Q50']");
        clickByXpath(".//*[@id='VehicleForm:odometerReading']/option[text() = '100-999 miles']");
        clickByXpath(".//*[@id='VehicleForm:ownership']/option[text() = 'Financed']");
        clickByXpath(".//*[@id='VehicleForm:otherBusiness']/option[text() = 'Pleasure']");
        clickByXpath(".//*[@id='VehicleForm:estimatedMileage']/option[text() = '0 - 3,000']");
        clickByXpath(".//*[@id='VehicleForm:addNo']");
        clickByXpath(".//*[@id='DriverForm:maritalStatus']/option[text() = 'Single']");
        clickByXpath(".//*[@id='DriverForm:gender:0']");
        typeByXpath(".//*[@id='DriverForm:ssn1']", "123");
        typeByXpath(".//*[@id='DriverForm:ssn2']", "45");
        typeByXpath(".//*[@id='DriverForm:ssn3']", "6789");
        clickByXpath(".//*[@id='DriverForm:curInsComp']/option[text() = 'Yes']");
        typeByXpath(".//*[@id='DriverForm:firstUSLicenseAge']", "18");
        typeByXpath(".//*[@id='DriverForm:ageFirstLicensedForeign']","17");
        clickByXpath(".//*[@id='DriverForm:fulltimeStudent:1']");
        clickByXpath(".//*[@id='DriverForm:addNo']");


    }

}
