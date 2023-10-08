package AC1;

public class Veterinario {
    private String nome;
    private String cpf;
    private String crmv;
    private char genero;
    private double valorConsulta;
    
    public Veterinario() {
    }
    
    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCrmv() {
        return crmv;
    }

    public void stCrmv(String crmv) {
        this.crmv = crmv;
    }
    
    
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    public double getSalario(int qtdConsultas) {
        return valorConsulta * qtdConsultas;
    }

    public String imprimir() {
        return "\n -------------"+
                "\n Nome: "+nome+
                "\n Cpf: "+ cpf +
                "\n Crmv: "+ crmv +           
                "\n Genero: "+ genero +
                "\n Valor da Consulta: "+ valorConsulta;
    }
    
    public String imprimir(int qtdConsultas) {
        String str = imprimir();
        
        str += "\n\n Salário: "+getSalario(qtdConsultas);
        
        return str;
    }
}