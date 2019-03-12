package g1;
/*
If you are seeing many errors, including on the import of com.hp.......
It probably means you are using a different version of leanFT than what is defined in the pom file.

In pom.xml, on line 12, you might find:
        <leanFT.version>14.51.0</leanFT.version>
and you might need to change to
        <leanFT.version>14.50.0</leanFT.version>
for example
 */
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

    }

}