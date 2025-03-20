public class Mago extends Personagem {
    private int mana;

    // Construtor
    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca); // Chama o construtor da superclasse Personagem
        this.mana = mana;
    }

    // Método para o mago usar magia
    public void usarMagia(Personagem outroPersonagem) {
        if (this.mana >= 10) {  // Verifica se o mago tem mana suficiente
            System.out.println(this.getNome() + " usou magia em " + outroPersonagem.getNome() + "!");
            this.mana -= 10; // Diminui a mana ao usar a magia
            int danoMagia = this.getForca() * 2;  // Magia faz o dobro do dano
            outroPersonagem.setVida(outroPersonagem.getVida() - danoMagia);
            System.out.println(outroPersonagem.getNome() + " perdeu " + danoMagia + " de vida devido à magia. Vida restante: " + outroPersonagem.getVida());
        } else {
            System.out.println(this.getNome() + " não tem mana suficiente para usar magia!");
        }
    }

    // Getters e Setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mago: " + this.getNome() + ", Vida: " + this.getVida() + ", Força: " + this.getForca() + ", Mana: " + this.mana;
    }
}
