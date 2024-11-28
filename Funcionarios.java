public class Funcionarios {
    private String nome;
    private int horasTrabalhadas;
    private double valorHoraTrabalho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(double valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public Funcionarios(String nome, int horasTrabalhadas, double valorHoraTrabalho) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public double calcularSalario(){
        return horasTrabalhadas * valorHoraTrabalho;

    }
    
}
