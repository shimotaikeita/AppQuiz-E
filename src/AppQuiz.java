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
