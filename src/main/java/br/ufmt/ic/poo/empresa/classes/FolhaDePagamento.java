package br.ufmt.ic.poo.empresa.classes;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class FolhaDePagamento {

    public static void calcularFolha(
            ArrayList<Funcionario> listaFuncionarios,
            int mes,
            int ano
    ) 
    {
Locale localeBrasil = new Locale("pt", "BR");
NumberFormat formatador = 
NumberFormat.getCurrencyInstance(localeBrasil);

        double totalFolhaMes = 0;
        
        System.out.println("FOLHA DE PAGAMENTO - "
                + mes + "/" + ano);
        
        for (Funcionario func : listaFuncionarios) {
    double salarioFuncionario = func.calcularSalario();
            System.out.println(
             "Funcionário: "+func.getNome()+"  \n" +
             "Matrícula: "+func.getMatricula()+"\n" +
             "Setor: "+func.getSetor()+"\n" +
             "Tipo: "+func.getClass()+" \n" +
             "Salário: R$ "+
          formatador.format(func.calcularSalario()));
            System.out.println("-".repeat(30));
            totalFolhaMes += salarioFuncionario;
        }
        System.out.println("Total do mês: "+
                formatador.format(totalFolhaMes));
        
    }
    
}
