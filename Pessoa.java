import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.Temporal;

//Isaac Newton(nascido em 4/1/1643
//Albert Einstein(nascido em 14/3/1879)


public class Pessoa {

    private String nome;

    private int idade;
    private int dia;
    private int mes;
    private int ano;

    Pessoa(String nome ,int dia, int mes,int ano){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int caucularIdade() {

        Temporal hoje = LocalDate.now();
        LocalDate dataDeNascimentoDoIsaacNewton = LocalDate.of(ano, mes, dia);
        LocalDate dataDeNascimentoDoAlbertEinstein = LocalDate.of(ano, mes, dia);

        dataDeNascimentoDoIsaacNewton.until(ChronoLocalDate.from(hoje));
       dataDeNascimentoDoAlbertEinstein.until(ChronoLocalDate.from(hoje));
        return dataDeNascimentoDoIsaacNewton.until(ChronoLocalDate.from(hoje)).getYears();

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