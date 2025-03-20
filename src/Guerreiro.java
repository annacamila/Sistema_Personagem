public class Guerreiro extends Personagem {
    private String espada;

    /**
     * construtor
     * @param nome Nome
     * @param vida Vida
     * @param forca Força
     * @param espada Espada
     */
    public Guerreiro(String nome, int vida, int forca, String espada) {
        super(nome, vida, forca);
        this.espada = espada;
    }

    public String getEspada() {
        return sword;
    }

    public void setEspada(String espada) {
        this.espada = espada;
        System.out.println(".");
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + getNome() + '\'' +
                ", health=" + getSaude() +
                ", strength=" + getVida() +
                ", sword='" + sword + '\'' +
                '}';
    }
}