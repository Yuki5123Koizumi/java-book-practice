/*コメント本文（複数行でも可） */
//コメント本文（行末まで）
public class MyDiary{
    public static void main(String[]args){
        System.out.println("フリーフォーマットの実験");
        int age;//年齢を入れる箱
        age=20;
        System.out.println("私は"+age+"歳");
        byte glasses;
        glasses=2;
        int salary;
        salary=152000;
        long worldPeople;
        worldPeople=690000000L;
        System.out.println("私の年齢は"+age);
        age=31;
        System.out.println("いや、本当の年齢は"+28);
        double pi=3.14;
        int pie=5;
        System.out.println("半径"+pie+"cmのパイの面積は、");
        System.out.println("パイの半径を倍にします");
        pi=10;
        System.out.println("半径"+pie+"cmのパイの面積は、");
        System.err.println(pie*pie*pi);
  }
}