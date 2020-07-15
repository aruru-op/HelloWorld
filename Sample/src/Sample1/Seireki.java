package Sample1;

import java.io.*;

public class Seireki {

	public static void main(String[] args) throws Exception {
		int showadifference = 1925; //西暦と昭和の差
		int heiseidifference = 1988; //西暦と平成の差
		int reiwadifference = 2018;//西暦と令和の差
		
		try {
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		System.out.println("西暦年を入力してください");
		int year = Integer.parseInt(br.readLine());
		System.out.print("西暦"+year+"年は、");
		
		if(year <= 1989 ) {
			year = year - showadifference;
			System.out.println("昭和"+year+"年です");			
		}else if(year <= 2019) {
			year = year - heiseidifference;
			System.out.println("平成"+year+"年です");	
		}else if (year <= 2020) {
			year = year - reiwadifference;
			System.out.println("令和"+year+"年です");	
		}
		}catch (NumberFormatException e){
			System.out.println("数値を入力してください");
		}catch(Exception e){
			System.out.println("予期せぬエラーが発生しました");
		}
	}
}
