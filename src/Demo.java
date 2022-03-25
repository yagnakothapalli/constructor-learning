import io.pragra.learning.AdvanceCalculator;
import io.pragra.learning.Calculator;
import io.pragra.learning.Employee;

import static io.pragra.learning.reverseName.reverse;

public class Demo {
    private String name;
    private int age;
    private Double balance;


    public Demo(String name) {
        this.name = name;
    }

    public Demo() {
        this("Yagna");
    }

    public Demo(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {








        Demo demo = new Demo();
        System.out.println(demo);
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 2, 7));
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.multiply(2, 7L));
        Employee employee = new Employee();
        System.out.println(employee.calWages(60.5, 10, 10, 70.2));

        System.out.println("Total words>=5 : ");

    }
}