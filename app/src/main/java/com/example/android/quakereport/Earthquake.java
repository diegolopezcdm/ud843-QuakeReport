package com.example.android.quakereport;

public class Earthquake {

    // @param magnitude earth quake magnitude
    private Double magnitude;

    // @param city location of earthquake
    private String location;

    private String url;

    // @param date , the  date of the earthquake
    private long date;

    public Earthquake(Double magnitude, String location, long date, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.date=date;
        this.url = url;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}