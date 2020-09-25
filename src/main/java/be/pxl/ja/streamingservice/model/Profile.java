package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public Profile(String name){
        this.name = name;
    }

    public boolean allowedToWatch(Content content){
        LocalDate now = LocalDate.now();
        int age = Period.between(dateOfBirth, now).getYears();
        if (dateOfBirth != null){
            if (content.getMaturityRating().getAge() > age){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
