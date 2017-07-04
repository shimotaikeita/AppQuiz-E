import java.util.InputMismatchException;
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
				boolean flag = true;
				final int correct = 2 ;
				System.out.println("同じような曲ばかりなのはどんなジャンルの音楽だろう？");
				System.out.print("1:J-POP ,2:童謡 ,3:演歌 \n 番号を入力してください：");
				int ans = 0;
				while(flag){
					try{
						ans = sc.nextInt();
						flag = false;
						if(ans < 1 || ans > 3){
							System.out.println("１～３のどれかを選んでください\n番号を入力してください：");
							flag = true;
						}
					}catch(InputMismatchException e){
						System.out.println("１～３のどれかを選んでください\n番号を入力してください：");
						flag = true;
					}
				}
				if(ans == correct){
					System.out.println("正解です");
					n += 1;
				}else{
					System.out.println("不正解です");
					System.out.println("正解は2：童謡でした。");
					n += 0;
				}
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
