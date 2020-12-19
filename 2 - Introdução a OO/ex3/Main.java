/*Considere um sistema para gerenciar contas de um banco e modelo uma conta bancária.
Uma conta deve ter o nome do titular, o número, a agência, o saldo e uma data de abertura.
Além disso, ela deve fazer as seguintes ações: saca, para retirar um valor do saldo;
deposita, para adicionar um valor ao saldo; calculaRendimento,
para devolver o rendimento mensal dessa conta. Implemente essa classe e teste-a,
usando uma outra classe que tenha o Main.
 */
package ex3;
/* @author Luam */

public class Main {
     public static void main(String[] args) {
         Conta conta = new Conta();
         
         conta.nome = "Hugo Reyes";
         conta.agencia = 4815;
         conta.num =  162342;
         conta.dataAbertura = "22/07/2004";
         conta.saldo = 156000;
         
         conta.imprimirConta();
         
         conta.depositar(4000);
         conta.sacar(100000);
         
         conta.imprimirRend();
     
     }
}
