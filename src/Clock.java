
public class Clock {

	public static void main(String[] args) {
		int seconds = getSeconds(18,32,47);
		System.out.println("1日の中で" + seconds + "秒経過しました");
	}

	//getSeconds
	//時、分、秒を引数で受け取ると、1日の経過秒数を計算する
	//サンプルデータ、18時32分47秒
	public static int getSeconds(int hour ,int min ,int sec) {
		//時間を秒に変換するには
		int result = hour * 3600 + min * 60 + sec;
		return result;
	}

}
