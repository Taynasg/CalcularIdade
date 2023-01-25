public class TestaPessoa {
    public static void main(String[] args) {

        Cientista alberteinstein = new Cientista("Albert Einstein", 14, 3, 1879);
        Cientista isaacNewton = new Cientista("Isaac Newton", 04, 01, 1643);

        System.out.println("=================================================");
        System.out.println("              CAUCULO DE IDADE");
        System.out.println("=================================================");
        System.out.println();


        System.out.println("Quais seriam  seriam as idades de Albert Einstein e Isaac Newton atualmente se eles ainda estivessem vivos? Vamos descobrir! " +
                "Importante: Eles nasceram respectivamente em 14/3/1879  e 4/1/1643 \n ");

        System.out.println(alberteinstein.informaNome());
        System.out.println("Caso estivesse vivo a idade dele seria " + alberteinstein.calcularIdade() + " anos ");

        System.out.println();

        System.out.println(isaacNewton.informaNome());
        System.out.println("Caso estivesse vivo a idade dele seria " + isaacNewton.calcularIdade() + " anos ");

    }
}