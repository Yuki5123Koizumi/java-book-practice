public class Fortune {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力して下さい");
        String name = new java.util.Scanner(System.in).nextLine();
        String messeage;
        messeage = name + "さん";
        System.out.println("あなたの年齢を入力してください。");
        String ageString = new java.util.Scanner(System.in).nextLine();
        // 変数ageStringの内容をint型に変換し、int型の変数ageに代入します。
        int age = Integer.parseInt(ageString);
        // 0から3までの乱数を生成し、int型の変数fortuneに代入します。
        int fortune = new java.util.Random().nextInt(4);
        // fortuneの数値をインクリメント演算子で1増やし1から4の乱数にします。
        fortune++;
        // 画面に「占いの結果が出ました！」と表示ます。
        System.out.println("占いの結果が出ました！");
        // 画面に「（年齢）歳の（名前）さん、あなたの運気番号は（乱数）です。」と表示します。その際、（年齢）には変数ageを、（名前）には変数nameを、そして（乱数）には⑧で作った数を表示します。
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");
        // 画面に「（1:大吉 2:中吉 3:吉 4:凶）」と表示します。
        System.out.println("1:大吉　2:中吉　3:吉　4:凶");
    }
}
