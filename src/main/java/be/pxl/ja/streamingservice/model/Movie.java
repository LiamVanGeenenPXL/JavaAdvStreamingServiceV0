package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;


public class Movie extends be.pxl.ja.opdracht1.Content implements Playable {
    private int duration;
    private String director;
    private LocalDate releasedate;

    private Genre genre;



    public Movie(String title, be.pxl.ja.opdracht1.Rating maturityRating) {
        super(title, maturityRating);
    }


    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(LocalDate releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public String toString() {
        return super.getTitle() + " " + releasedate.getYear();
    }


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration) ;
    }

}

