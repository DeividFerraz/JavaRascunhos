package exerciciooocomposicaoquantoganouemtalano;

import entidades.Departamento;
import entidades.HoraContrato;
import entidades.Trabalhador;
import java.util.Locale;
import java.util.Scanner;
import entidadesEnum.CargoTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioOOComposicaoQuantoGanouEmTalAno {
    public static void main(String[] args) throws ParseException { 
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
        System.out.println("Coloque o Nome do departamneto: ");
        String nomeDepartamento = sc.nextLine();
        
        System.out.println("Dados do trabalhador: ");
        System.out.println("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        
        System.out.println("Cargo: ");
        String cargoTrabalhador = sc.nextLine();
        
        System.out.println("Salario Base: ");
        double salarioTrabalhador = sc.nextDouble();
        
       Departamento departamento = new Departamento(nomeDepartamento);
       Trabalhador peao = new Trabalhador(nomeTrabalhador, CargoTrabalhador.valueOf(cargoTrabalhador), salarioTrabalhador, departamento);

        System.out.println("Quantos contratos esse trabalhator vai ter");
        int n = sc.nextInt();
        
        for(int i=1;i<=n; i++){
            System.out.println("Quantos contratos #" + i + "data: ");
            System.out.println("date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.println("duração hora: ");
            int hours = sc.nextInt();
            HoraContrato contract = new HoraContrato(contractDate, valorHora, hours);
            peao.addContrato(contract);
        }
        
        double valorTotalHoras = 0.0;
        for (HoraContrato contract : peao.getContracts()) {
            valorTotalHoras += contract.getValueValorHora() * contract.getHours();
        }

        double salarioTotal = peao.getBaseSalary() + valorTotalHoras;

        
        System.out.println();
        System.out.println("Entre com mes e ano para calcular salario (MM/YYYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("Nome: " + peao.getName());
        System.out.println("Departamento: " + peao.getDepartamento().getName());
        System.out.println("No mes selecionado ele produziu " + valorTotalHoras + " R$: " + "Salario base: " + String.format("%.2f", peao.income(ano, mes))+" R$");
        System.out.println("Total do mes em questão: " + salarioTotal+" R$");
    }


}

    
