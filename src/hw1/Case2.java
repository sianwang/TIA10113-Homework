package hw1;

public class Case2 {

//請設計一隻Java程式並計算200顆雞蛋共是幾打幾顆? (一打為12顆);
	
	public static void main(String[] args) {

		int i1 = 200, i2 = 12;		//i1 = 雞蛋數量, i2 = 12為單位一打
		int suryou = i1 / i2, piece = i1% i2; 		//雞蛋數量除12, 雞蛋數量除12剩餘餘數

		System.out.println("雞蛋數量為"+ i1+ "="+ suryou+ "打"+ piece+ "顆"); // 輸出結果
	}
}
