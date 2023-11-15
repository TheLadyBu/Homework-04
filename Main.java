public class Main {
    public static void main (String [] args) {
        //Надаємо значення полям a, b, c, d
        int a = 5;
        int b = 9;
        int c = 3;
        int d = 7;
        //Знаходимо суму Sum1 між a і b
        int Sum1 = a + b;
        //Знаходимо суму Sum2 між c і d
        int Sum2 = c + d;
        // Виводимо результат порівняння Sum1 і Sum2
        System.out.println("Sum1 > Sum2 - " + (Sum1 > Sum2));
        //Збільшуємо Sum1 на 1
        Sum1 +=1;
        //Зменшуємо Sum2 на 2
        Sum2 -=2;
        //Виводимо результат порівняння Sum1 і Sum2 після змін
        System.out.println("Sum1 > Sum2 - " + (Sum1 > Sum2));
        //Виводимо true якщо хоча б одна сума кратна 2, інакше - false
        int e = Sum1 % 2;
        int f = Sum2 % 2;
        System.out.println((e==0)||(f==0));
    }
}