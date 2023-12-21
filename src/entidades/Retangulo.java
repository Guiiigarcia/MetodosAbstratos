package entidades;

import enums.Color;

public class Retangulo  extends Forma{
    private Double largura;
    private Double altura;

    public Retangulo(Color cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double area() {
        double area = 0.0;
        return area = largura * altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
