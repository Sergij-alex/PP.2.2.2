package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String colour;
    private int series;

    public Car() {
    }
    public Car(String model, String colour, int series) {
        this.model = model;
        this.colour = colour;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, colour, series);
    }
}
