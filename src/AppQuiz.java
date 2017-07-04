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
			System.out.println("光の三原色、赤と青とあとひとつは？ 1:黄色 2:緑 3: 白");
			answer =sc.nextInt();
			if(answer == 2){
				System.out.println("正解です");
				n++;
			}else{
				System.out.println("違います");
			}


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
