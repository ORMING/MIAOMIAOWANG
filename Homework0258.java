public class Homework0258{
	public static void main(String[] args) {
		Music music = new Music("庆丰话",300);
		music.play();
		System.out.println(music.getInfo());
	}
}
class Music{
	String name;
	int time;
	public Music(String name , int time) {
		this.name = name;
		this.time = time;
	}
	//播放功能
	public void play(){
		System.out.println("音乐" + name + "正在播放中" + time +"秒");
	}
	public String getInfo() {
		return "音乐" + name + "播放时间" + time;
	}
}