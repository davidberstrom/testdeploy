package io.david.coronatracker.Models;

public class LocationStats {
    
    private String country;
    private int latestTotalCases;
    private String state;
    private int diff;

    public int getDiff() {
        return diff;
    }
    public void setDiff(int diff) {
        this.diff = diff;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getLatestTotalCases() {
        return latestTotalCases;
    }
    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats [country=" + country + ", latestTotalCases=" + latestTotalCases + "]";
    }
    
}
