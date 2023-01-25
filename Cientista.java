import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.Temporal;

public class Cientista {

    private String nome;
    private int dia;
    private int mes;
    private int ano;

    Cientista(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int calcularIdade() {

        Temporal hoje = LocalDate.now();
        LocalDate dataDeNascimento = LocalDate.of(ano, mes, dia);
        dataDeNascimento.until(ChronoLocalDate.from(hoje));
        return dataDeNascimento.until(ChronoLocalDate.from(hoje)).getYears();
    }

    public String informaNome() {
        return this.nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }


}