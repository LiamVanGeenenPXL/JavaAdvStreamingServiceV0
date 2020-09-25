package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.opdracht1.Movie implements Playable{

    private String topic;

    public Documentary(String title, be.pxl.ja.opdracht1.Rating maturityRating, String topic) {
        super(title, maturityRating);
        this.topic = topic;
        super.setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }
}
