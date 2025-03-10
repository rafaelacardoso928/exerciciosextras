
package sistemasdeveiculos;

public class SistemasdeVeiculos {

    public static void main(String[] args) {
      Carro carro = new Carro("Toyota", "Corolla", 4, 2022);
        Moto moto = new Moto("Honda", "CB500", 500);

        carro.exibirDetalhes();
        moto.exibirDetalhes();

        carro.definirDetalhes("2025");
        carro.exibirDetalhes();
    }
}
    
    

