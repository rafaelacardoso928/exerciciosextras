
package tiposdetransportes;

     abstract class Transporte {
    protected int capacidade;  // Atributo capacidade com visibilidade protegida

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void mover();
}

