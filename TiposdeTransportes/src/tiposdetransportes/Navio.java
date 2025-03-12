
package tiposdetransportes;

    class Navio extends Transporte {
    private double tonelagem;  // Atributo tonelagem com visibilidade privada

    public Navio(int capacidade, double tonelagem) {
        super(capacidade);
        this.tonelagem = tonelagem;
    }

    // Sobrecarga do método definirTonelagem para aceitar um valor inteiro
    public void definirTonelagem(int tonelagem) {
        this.tonelagem = tonelagem;
    }

    // Sobrecarga do método definirTonelagem para aceitar um valor decimal (double)
    public void definirTonelagem(double tonelagem) {
        this.tonelagem = tonelagem;
    }

    @Override
    public void mover() {
        System.out.println("O Navio está navegando com " + tonelagem + " toneladas de carga.");
    
    }
    }
