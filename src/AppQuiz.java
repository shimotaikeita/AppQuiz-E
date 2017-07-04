import java.util.Scanner;

public class AppQuiz {
	static int n = 0;
	static Scanner sc = new Scanner(System.in);
	static int answer = 0;

	//
	//全合計点は5点 正解するたびにnで1点ずつカウント

		public static void situmon1(){
			//質問内容を表示
			//ユーザーが答えを入力
			//答えを表示
			//カウントする
			}
		public static void situmon2(){
			System.out.println("この中でホワイトハウスに無いものは？");
			System.out.println("1.テニスコート");
			System.out.println("2.映画館");
			System.out.println("3.ボウリング場");
			System.out.println("4.水族館");
			System.out.print("答えを入力してください ：");
			 answer = sc.nextInt();
			if(answer == 4){
			System.out.println("正解です！1点追加！");
			   n ++;
			}
			else if(answer != 4){
			System.out.println("残念！答えは、4.水族館です！");
			}
		}
		public static void situmon3(){
			//質問内容を表示
			//ユーザーが答えを入力
			//答えを表示
			//カウントする

		}
		public static void situmon4(){
			//質問内容を表示
			//ユーザーが答えを入力
			//答えを表示
			//カウントする

		}
		public static void situmon5(){
			//質問内容を表示
			//ユーザーが答えを入力
			//答えを表示
			//カウントする

		}

		public static void main(String[] args) {

			situmon1();
			situmon2();
			situmon3();
			situmon4();
			situmon5();

			System.out.println("合計点は" + n + "です");
		}
}
