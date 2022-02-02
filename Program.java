import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static <Char> void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employee> listOfEmployees = new ArrayList<>();


        System.out.print("Enter number of employees:\n");
        int numberOfEmployees = input.nextInt();

        for(int i = 1; i <= numberOfEmployees; i++){
            System.out.printf("Employee %d data:\n", i);
            System.out.print("Outsourced (y/n)?\n");
            char ch = input.next().charAt(0);
            System.out.print("Name of employee:\n");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Hours of employee:\n");
            int hours = input.nextInt();
            System.out.println("Value per hour:\n");
            Double valuePerHour = input.nextDouble();
            if(ch == 'y'){
                System.out.println("Addional charge:\n");
                Double addCh = input.nextDouble();
                listOfEmployees.add(new OutsourcedEmployee(name, hours, valuePerHour, addCh));
            } else {
                listOfEmployees.add(new Employee(name, hours, valuePerHour));
            }
        }

        for(Employee emp : listOfEmployees){
            System.out.println(emp.getName() + "\t-\tR$" + String.format("%.2f", emp.payment()));
        }

        input.close();
    }

}
