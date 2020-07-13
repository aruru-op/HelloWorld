package Sample1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderSample1 {
	public static void main( String[] args ) throws Exception{
	
		try(BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));){
			System.out.println("文字列を入力してください");
			String str = br.readLine();//文字列を入力			
			System.out.println("整数を入力してください。");
			int num = Integer.parseInt(br.readLine());//入力された数値をint型に変換
		
			System.out.println(str+"が入力されました");
			System.out.println(num+"が入力されました");
			
		}catch (NumberFormatException e) {
			System.out.println("整数を入力してください");
		}catch (Exception e) {
			System.out.println("予期せぬエラーが発生しました");
		}finally {
			System.out.println("処理が完了しました");
		}
	}
}