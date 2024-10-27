import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Students> set = new HashSet<>();

        System.out.println("How many students for course A? ");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            set.add(new Students(id));
        }
        System.out.println("How many students for course B? ");
        qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            set.add(new Students(id));
        }
        System.out.println("How many students for course C? ");
        qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++) {
            int id = sc.nextInt();
            set.add(new Students(id));
        }
        System.out.println("Total students: " + set.size());
    }
}