
package tiposdepagamento;


    abstract class Pagamento {
    protected double valor;  // Atributo protegido para valor

    // Construtor para inicializar o valor do pagamento
    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void processarPagamento();
}

// Subclasse CartaoCredito
class CartaoCredito extends Pagamento {
    private double limite;  // Atributo privado para o limite do cartão

    // Construtor para CartaoCredito
    public CartaoCredito(double valor) {
        super(valor);  // Chama o construtor da classe pai (Pagamento)
    }

    // Método para definir o limite com valor do tipo double
    public void definirLimite(double limite) {
        this.limite = limite;
    }

    // Método para definir o limite com valor do tipo int
    public void definirLimite(int limite) {
        this.limite = (double) limite;
    }

    // Sobrescreve o método processarPagamento para a implementação específica do cartão de crédito
    @Override
    public void processarPagamento() {
        if (valor <= limite) {
            System.out.println("Pagamento de " + valor + " processado com sucesso no Cartão de Crédito.");
        } else {
            System.out.println("Limite do Cartão de Crédito insuficiente para o pagamento de " + valor);
        }
    }
}

// Subclasse Boleto
class Boleto extends Pagamento {
    private String codigoBarras;  // Atributo privado para código de barras do boleto

    // Construtor para Boleto
    public Boleto(double valor) {
        super(valor);  // Chama o construtor da classe pai (Pagamento)
    }

    // Método para definir o código de barras
    public void definirCodigo(String codigo) {
        this.codigoBarras = codigo;
    }

    // Sobrescreve o método processarPagamento para a implementação específica do boleto
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de " + valor + " processado com sucesso via Boleto. Código de barras: " + codigoBarras);
    }
}

