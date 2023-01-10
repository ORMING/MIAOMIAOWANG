public class VarParameterExercise{
	public static void main(String[] args) {
		HspMethod01 hm = new HspMethod01();
		System.out.println( hm.showScors("milan",90.5,34.5,34.65));
	}
}
class HspMethod01{
	public  String showScors(String name,double...scores) {
		double totalScore = 0;
		for(int i =0;i < scores.length;i++) {
			totalScore += scores[i];
		}
		return name +"有"+scores.length+"总成绩="+totalScore;
	}
}