public class Work014701{
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;
		while(true){
			if(money > 50000) {
				money -=(money*0.05);
			}else if(money <= 50000 && money >= 1000) {
				money -= 1000;
			}else {
				break;
			}
			count++;
		}
		System.out.println("這貨過橋次數="+ count +"剩下錢" + money);
	}
}