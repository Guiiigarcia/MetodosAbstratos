package entidades;


import enums.Color;

public abstract class Forma {
    private Color cor;

    public Forma() {
    }

    public Forma(Color cor) {
        this.cor = cor;
    }

    public abstract Double area();

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
}
