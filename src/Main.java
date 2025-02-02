//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double cardDebt = 5000;
        double interestRate = .17;
        System.out.println("The total due the first month is: "+(cardDebt*interestRate));
        System.out.println("The total due the second month is: "+((cardDebt*interestRate)*(1+interestRate)));
    }
}