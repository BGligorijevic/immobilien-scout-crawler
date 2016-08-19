package com.prodyna;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     *
     * @throws URISyntaxException
     * @throws IOException
     */
    @Test
    @Ignore
    public void testApp() throws IOException, URISyntaxException {
        Set<String> apartments = new HashSet<>();
        apartments.add("87355778");
        apartments.add("87266815");

        GmailSender.send(apartments);
    }
}
