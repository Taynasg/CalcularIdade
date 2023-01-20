public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa alberteinstein = new Pessoa();
        Pessoa isaacnewton = new Pessoa();
        Pessoa pessoa = new Pessoa();

        System.out.println("=================================================");
        System.out.println("              CAUCULO DE IDADE");
        System.out.println("=================================================");
        System.out.println();


        System.out.println("Qual seria a idade de Albert Einstein atualmente se ele ainda estivesse vivo? Vamos descobrir! " +
                "Importante: Ele nasceu em 4/1/1643 \n ");

        System.out.println(pessoa.caucularIdade());
    }
}