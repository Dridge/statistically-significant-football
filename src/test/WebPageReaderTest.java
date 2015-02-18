package test;

import com.github.dridge.websiteinteraction.WebPageReader;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.fail;

/**
 * Created by Richard on 16/02/2015.
 */
public class WebPageReaderTest {
    @Test
    public void test() {
        WebPageReader wpr = new WebPageReader();
        String result = null;
        try {
           result =  wpr.getWebPageDetail("http://www.premierleague.com/en-gb/players/ea-sports-player-performance-index/");
        } catch (IOException e) {
            fail();
            e.printStackTrace();
        }
        if (result == null) {
            fail();
        }
        //TODO create a webpageundertest and verify returned text is correct
        //see resources package for html and spin up local webpage running on local host
    }
}
