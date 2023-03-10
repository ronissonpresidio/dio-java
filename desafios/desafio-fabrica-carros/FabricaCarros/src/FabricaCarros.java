import java.security.DrbgParameters;
import java.util.Scanner;

public class FabricaCarros {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int custoFabrica = sc.nextInt();
        int porcentagemDistribuidor = sc.nextInt();
        int percentualImpostos = sc.nextInt();

        int custoConsumidor;
        int distribuidor;
        int valorImpostos;

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;

        custoConsumidor = custoFabrica + distribuidor + valorImpostos;

        System.out.println(custoConsumidor);

    }
}
