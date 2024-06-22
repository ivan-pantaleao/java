import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pesquisaCidadesMain {

    public static void main(String[] args) {
        List<Cidades> cidades = new ArrayList<>();
        cidades.add(new Cidades("Maringá", 4115200, 337192, 5927));
        cidades.add(new Cidades("Londrina", 4113700, 440048, 2565));
        cidades.add(new Cidades("Cascavel", 4104808, 282277, 1326));
        cidades.add(new Cidades("Ponta Grossa", 4119905, 247451, 1941));
        cidades.add(new Cidades("Foz do Iguaçu", 4108304, 218094, 2369));

        Cidades cidadeMaisAcidentes = cidades.get(0);
        Cidades cidadeMenosAcidentes = cidades.get(0);

        double somaAcidentes = 0;
        double somaVeiculos = 0;

        for (Cidades cidade : cidades) {
            if (cidade.getNumeroAcidentes() > cidadeMaisAcidentes.getNumeroAcidentes()) {
                cidadeMaisAcidentes = cidade;
            }
            if (cidade.getNumeroAcidentes() < cidadeMenosAcidentes.getNumeroAcidentes()) {
                cidadeMenosAcidentes = cidade;
            }
            somaAcidentes += cidade.getNumeroAcidentes();
            somaVeiculos += cidade.getQuantidadeVeiculos();
        }

        System.out.println("Cidade com mais acidentes: " + cidadeMaisAcidentes.getNome());
        System.out.println("Cidade com menos acidentes: " + cidadeMenosAcidentes.getNome());

        for (Cidades cidade : cidades) {
            System.out.printf("A média de acidentes em %s: %.2f%%\n", cidade.getNome(), cidade.calcularMediaAcidentes() * 100);
        }

        double mediaTotalAcidentes = somaAcidentes / somaVeiculos;
        System.out.printf("A média de acidentes das cidades pesquisadas é: %.2f%%\n", mediaTotalAcidentes * 100);
    }
}
