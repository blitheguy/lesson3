import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        int a,b;
        a = 5;
        b = 2;
        int sum = a+b;
        int sub = a-b;
        int mult = a*b;
        float div = a/b;
        int rem = a%b;
        a+=6;
        System.out.println(a);
        a*=6;
        System.out.println(a);
        a++;
        System.out.println("sum="+sum);
        System.out.println("subtraction="+sub);
        System.out.println("mutiplication="+mult);
        System.out.println("division="+div);
        System.out.println("reminder="+rem);
        System.out.println("increment="+a);
        a--;
        System.out.println("decrement="+a);
        Scanner scan=new Scanner(System.in);
        System.out.println("input number1");
        long n1=scan.nextLong();
        System.out.println("input number2");
        long n2=scan.nextLong();
        System.out.println("Sum="+(n1+n2));
        //урок №5 логические операторы if/else if
        System.out.println("Введите первое число для сравниения");
        long n3=scan.nextLong();
        System.out.println("Введите второе число для сравниения");
        long n4=scan.nextLong();
        if (n3>n4) System.out.println("Первое число больше");
        else if (n3<n4) System.out.println("Второе число больше первого");
        else System.out.println("Числа равны");
    }
}
