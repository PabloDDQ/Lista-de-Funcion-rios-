public class Tercerizados extends Funcionarios{

    public Tercerizados(String nome, int horasTrabalhadas, double valorHoraTrabalho){
        super(nome, horasTrabalhadas, valorHoraTrabalho);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.15;
    }

    
}
