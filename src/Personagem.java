// Superclasse Personagem
public class Personagem {
    // Atributos comuns
    protected String nome;
    protected int vida;
    protected int forca;

    // Construtor
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    // Método para o personagem atacar
    public void atacar() {
        System.out.println(nome + " atacou com força " + forca);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
