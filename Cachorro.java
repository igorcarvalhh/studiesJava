public class Cachorro {
    private int idade;
    private String raca = "vira-lata";

    public int getIdade() {
        return idade;
    }

    public void setIdade(int x) {
        this.idade = x;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String newRaca) {
        this.raca = newRaca;
    }

    public Cachorro(int x) {
        this.idade = x;
    }

    public static void latir() {
        System.out.println("Au! Au!");
    }
}
