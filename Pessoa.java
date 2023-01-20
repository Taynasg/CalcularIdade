import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Isaac Newton(nascido em 4/1/1643
//Albert Einstein(nascido em 14/3/1879)

public class Pessoa {
    Scanner scanner = new Scanner(System.in);
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public String caucularIdade() {

        LocalDate data = LocalDate.now();
        DateTimeFormatter dataAtualFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy \n");

        System.out.println("A data de hoje é " + data.format(dataAtualFormatada));

        LocalDate dataDeNascimentoDoIsaacNewton  = data.minusYears(380);
        LocalDate dataDeNascimentoDoAlbertEinstein = data.minusYears(143);

        Period newton = Period.between(data, dataDeNascimentoDoAlbertEinstein);
        Period eintein = Period.between(data, dataDeNascimentoDoIsaacNewton);

        return "Atualmente Isaac Newton teria " + newton.multipliedBy(-1).getYears() + " anos \n" +
        "Atualmente Albert Einstein teria " + eintein.multipliedBy(-1).getYears() + " anos";
    }

    public void informaIdade() {


    }

    public void informaNome() {

    }

    public void ajustaDataDeNascimento() {

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
