package g1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://advantageonlineshopping.com/#/");

        Link sPEAKERSLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        sPEAKERSLink.click();

        Button buyNowButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("BUY NOW")
                .tagName("BUTTON").build());
        buyNowButton.click();

        AOS_AM appModel = new AOS_AM(browser);
        appModel.aMenuCartWebElement().click();
        appModel.aREMOVEWebElement().click();
        appModel.aCONTINUESHOPPINGLink().click();

    }

}