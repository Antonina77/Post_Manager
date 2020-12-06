package ru.netology.domain;

public class Location {
    private Object place; //указание конкретного места
    private String coordinate; //координаты

    public Object getPlace() {
        return place;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
}
