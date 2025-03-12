
package tiposdepagamento;

public class TiposdePagamento {

    public static void main(String[] args) {
     CartaoCredito cartao = new CartaoCredito(500);
        cartao.definirLimite(1000); 
        cartao.processarPagamento(); 

        cartao.definirLimite(300);  
        cartao.processarPagamento(); 

        // Testando o Boleto
        Boleto boleto = new Boleto(150);
        boleto.definirCodigo("1234567890123456789012345678901234567890");
        boleto.processarPagamento(); 
    }
}
    
    

