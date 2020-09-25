package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little kids",0),
    OLDER_KIDS("Older kids",7),
    TEENS("Teens",12),
    MATURE("Mature",16);

    private String rating;
    private int age;

    Rating(String rating, int age){
        this.rating = rating;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
