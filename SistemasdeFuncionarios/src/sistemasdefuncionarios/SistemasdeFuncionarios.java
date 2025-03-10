
package sistemasdefuncionarios;

public class SistemasdeFuncionarios {

    public static void main(String[] args) {
     Gerente gerente = new Gerente("Carlos", 1000);
        Desenvolvedor dev = new Desenvolvedor("Ana", 160);

        System.out.println(gerente);
        System.out.println(dev);

        gerente.definirBonus(1500);
        System.out.println(gerente);

        dev.definirHorasTrabalhadas(180);
        System.out.println(dev);
    }
}
    
    

