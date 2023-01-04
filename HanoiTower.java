public class HanoiTower{
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(10, 'A', 'B', 'C');
	}
}
class Tower {
	//方法 
	//num表示要移动的个数，a，b，c 分别表示A塔 B塔 C塔
	public void move(int num,char a,char b,char c) {
		if(num == 1) {//只有一个盘
			System.out.println(a +"->" + c);
		}else {
			//如果有多个盘，可以看成两个，最下面和上面所有盘（num-1）
			//1 先移动上面所有盘到b，借助c
			move(num - 1, a, c, b);
			//2 把最下面的盘，移动到c
			System.out.println(a +"->" + c);
			//3 再把b塔所有盘移动到c借助啊
			move(num - 1, b, a, c);
		}
	}
}