public class Main {
    public static void main(String[] args) {
        int number1 = 3;

        // int型の変数number2を定義し、7を代入してください
        int number2 = 7;

        // number1 * number2を出力してください
        System.out.println(number1 * number2);

        // 変数textに「プログラミングを勉強しよう」を代入してください
        String text = "プログラミングを勉強しよう";

        // 「Progateで」と変数textを連結して出力してください
        System.out.println("Progateで" + text);

        // 変数number1を上書きする
        number1 = 5;
        System.out.println(number1 * number2);

        // 変数textを上書きする
        text = "Javaを勉強しよう";
        System.out.println("Progateで" + text);

        // 自己代入する
        number1 = number1 + 1;
        System.out.println(number1);

        // 自己代入の省略 number1+1, number2*7
        number1 ++;
        System.out.println(number1);
        number2 *= 2;
        System.out.println(number2);

        // 三角形、四角形の面積を出す。
        int length = 3;
        int height = 4;
        int rectangleArea = length *height;
        int triangleArea = length *height/2;
        System.out.println(rectangleArea);
        System.out.println(triangleArea);

        // 少数の変数 double型
        double number3 = 8.5;
        System.out.println(number3);

        double number4 = 3.4;
        System.out.println(number3 + number4);
        
        // int型同士の計算
        System.out.println(5/2);
        // double型同士の計算
        System.out.println(5.0/2.0);
        // double型int型の計算
        System.out.println(5.0/2);
        
        // int型同士の計算で、少数まで出す場合も作る。
        // 強制的な型変換をキャストと呼ぶ・
        int number5 = 13;
        int number6 = 4;
        System.out.println(number5/number6);
        System.out.println((double)number5/number6);
    }
}
