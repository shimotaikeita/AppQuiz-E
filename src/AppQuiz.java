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
			//質問内容を表示
			//ユーザーが答えを入力
			//カウントする
		}
		public static void situmon3(){
			//質問内容を表示
			//ユーザーが答えを入力
			//答えを表示
			//カウントする

		}
		public static void situmon4(){
			System.out.println("今年は平成何年？");
			answer = sc.nextInt();
			System.out.println("答えは平成29年です");
			if(answer == 29) {
				n++;
			}

		}
		public static void situmon5(){
			System.out.println("東京タワーの高さは？");
			System.out.println("1:1.5M, 2:200M, 3:333M, 4:114514M");

			answer = sc.nextInt();

			System.out.println("答えは3の333Mでした。");

			if(answer == 3){
				n++;
			}
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
