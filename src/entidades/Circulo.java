package entidades;

import enums.Color;

public class Circulo extends Forma{
    private Double radius;

    public Circulo(Color cor, Double radius) {
        super(cor);
        this.radius = radius;
    }

    @Override
    public Double area() {
        double area = 0.0;
        return area = Math.PI * Math.pow(radius,2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
