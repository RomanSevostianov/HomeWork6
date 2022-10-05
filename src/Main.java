public class Main {
    public static void main(String[] args) {

        for (int i=1; i<=10;i++){
        System.out.println(i);}
        for (int i=10; i>=1;i--)
            System.out.println(i);
        for (int i=0; i<=17;i=i+2)
            System.out.println(i);
        for (int i=10; i>=-10;i--)
            System.out.println(i);
        for (int i=1904; i<=2096;i=i+4)
            System.out.println(i);
        for (int i=7; i<=98;i=i+7)
            System.out.println(i);
        int in = 1;
        for (int i=0; i<=8;i++) {
            in = in * 2;
            System.out.println(in);

        }
        int general=0;
        int salary = 29000;
        int y=0;
        for (int i=1; i<=12;i++) {

            general=salary+general;
            System.out.println("Месяц "+i+"  "+general+" Общая сумма с процентами "+(general+(general/100))+" Проценты  "+general/100);
            y=(general+(general/100))+y;

        }
        System.out.println("Заработал за год с процентами  "+y);
    }
}