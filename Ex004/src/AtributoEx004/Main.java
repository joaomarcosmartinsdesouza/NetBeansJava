/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AtributoEx004;

public class Main {
    
    public static void main(String[] Args){
        
        ClassEngenheiro eng1 = new ClassEngenheiro();
        eng1.nome = "Joao";
        eng1.crea = "856000";
        eng1.cpf = "100300400-00";
        eng1.salarioBruto = 10000;
        eng1.cargo = "Engenheiro";
        
        System.out.println("Nome: "+eng1.nome+", cargo: "+eng1.cargo+", Crea: "+eng1.crea+", CPF: "+eng1.cpf);
        System.out.println("Salario Liquido: "+eng1.calcularSalarioLiquido(0.75f, 1000f));
        
        ClassMedico medico1 = new ClassMedico();
        medico1.nome = "Sandoval Aguirre";
        medico1.crm = "31985";
        medico1.cpf = "014467897-00";
        medico1.salarioBruto = 20000;
        medico1.cargo = "Medico";
        
        System.out.println("Nome: "+medico1.nome+", cargo: "+medico1.cargo+", Crea: "+medico1.crm+", CPF: "+medico1.cpf);
        System.out.println("Salario Liquido: "+eng1.calcularSalarioLiquido(0.75f, 7000f));
        
        ClassProfessor prof1 = new ClassProfessor();
        prof1.nome = "Jurandir Severo";
        prof1.cargo = "Professor";
        prof1.cpf = "011987321-01";
        prof1.salarioBruto = 40;
        prof1.horasTrabalhadas = 200;
        
        System.out.println("Nome: "+prof1.nome+", cargo: "+prof1.cargo+", CPF: "+prof1.cpf);
        System.out.println("Salario Liquido: "+prof1.calcularSalarioLiquido(0.75f, 333.2f ));
        
    }

}
