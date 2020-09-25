package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileTest {

    @Test
    public void allowedToWatchTest(){
        LocalDate birthdate = LocalDate.parse("2000-01-08");
        Profile profile = new Profile("Liam", birthdate);
        Content content = new Content("test", Rating.MATURE);

        Assertions.assertTrue(profile.allowedToWatch(content));
    }
}
