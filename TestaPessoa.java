public class TestaPessoa {
    public static void main(String[] args) {
        //Isaac Newton(nascido em 4/1/1643
//Albert Einstein(nascido em 14/3/1879)

        Pessoa alberteinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 04, 01, 1643);

        System.out.println("=================================================");
        System.out.println("              CAUCULO DE IDADE");
        System.out.println("=================================================");
        System.out.println();


        System.out.println("Quais seriam  seriam as idades de Albert Einstein e Isaac Newton atualmente se eles ainda estivessem vivos? Vamos descobrir! " +
                "Importante: Eles nasceram respectivamente em 14/3/1879  e 4/1/1643 \n ");

        System.out.println(alberteinstein.informaNome());
        System.out.println("Caso estivesse vivo a idade dele seria " + alberteinstein.caucularIdade() + " anos ");

        System.out.println();

        System.out.println(isaacNewton.informaNome());
        System.out.println("Caso estivesse vivo a idade dele seria " + isaacNewton.caucularIdade() + " anos ");

    }
}