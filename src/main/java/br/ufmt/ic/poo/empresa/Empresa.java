package br.ufmt.ic.poo.empresa;

import br.ufmt.ic.poo.empresa.classes.Vendedor;

public class Empresa {

    public static void main(String[] args) {
        
        Vendedor joao = new Vendedor();
        joao.setNome("João Silva");
        joao.setCpf("111.111.111-11");
        joao.setMatricula("9999");
        joao.setSetor("Softwares Empresariais");
        joao.setSalarioBase(3500);
        joao.setComissao(0.05); //5% de comissão
        joao.setTotalVendas(100000);
    }
    
}
