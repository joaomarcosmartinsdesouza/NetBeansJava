/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AtributoEx004;

public class AtributeClassProfissional {
    
    String cpf;
    String nome;
    String cargo;
    float salarioBruto;
    
    float calcularSalarioLiquido (float desconto, float bonus){
        float calcularSalarioLiquido = salarioBruto * desconto + bonus;
        return calcularSalarioLiquido;
    }

}
