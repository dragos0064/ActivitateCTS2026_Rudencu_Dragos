package simple.factory.stb.clase;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca, int linia){
        this.marca = marca;
        this.linia = linia;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Linia: ").append(linia).append("\n");

        return sb.toString();

    }
}
