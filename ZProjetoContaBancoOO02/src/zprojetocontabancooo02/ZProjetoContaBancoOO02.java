package zprojetocontabancooo02;

import java.util.Locale;
import java.util.Scanner;

public class ZProjetoContaBancoOO02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe os dados da conta: ");
        
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        Double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double withDrawLimit = sc.nextDouble();
        
        Account acc = new Account(number, holder, balance, withDrawLimit);
    
        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try{//tentar
            acc.withdraw(amount); //chamei essa função, essa função chamou outra função q coloquei la dentro que é a validationWithDraw(amount);
            //ela testou o if, deu o erro, voltou para cá, ativou a função catch e mostrou a exceção
            System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
        } catch (BusinnesExcepiton e){
            System.out.println(e.getMessage());
        }

     }
    
}
// dentro da classe BusinnesExcepiton eu colocaquei uma super(msg) com extenção da classe runtime, agr eu add a clase BusinnesExcepiton duas strings de erro
//agr sempre que der algum erro, é só eu chamar a classe BusinnesExcepiton que ele ja vai mostrar a excessao.
//chamo o getMessage dizendo que quero q ele me retorne a mensagem que eu passei para ele la dentro.