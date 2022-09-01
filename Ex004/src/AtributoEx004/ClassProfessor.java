/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AtributoEx004;

public class ClassProfessor extends AtributeClassProfissional {
    
    int horasTrabalhadas;
    
    @Override
            // metodo com dois parametros (float, float): desconto com bonus
    float calcularSalarioLiquido(float desconto, float bonus){
        float calcularSalarioLiquido = salarioBruto * horasTrabalhadas * desconto + bonus;
        return calcularSalarioLiquido;
    }
    // metodo com apenas 1 parametro float. Neste caso nao ha bonus
    float calcularSalarioLiquido(float desconto){
        return (salarioBruto * horasTrabalhadas * desconto);
    }

}
