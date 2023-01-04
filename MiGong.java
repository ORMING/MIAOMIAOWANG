public class MiGong{
	public static void main(String[] args) {
		//先创建迷宫用二维数组表示
		//0表示可以走1表示障碍物
		int[][] map = new int[8][7];
		//将最上和最下全部设置位1
		for(int i =0;i < 7 ;i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//将最左和最右变成1
		for(int i = 0; i < 8;i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//添加中间障碍物
		map[4][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;
		//输出当前地图
		System.out.println("======当前地图情况=====");
		for(int i = 0; i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j]+" ");//输出一行
				
			}
			System.out.println();
		}
		//使用findWay给老鼠找路
		T2 t1 = new T2();
		t1.findWay(map, 1, 1);
		System.out.println("\n找到路的情况下");
		for(int i = 0; i < map.length;i++) {
			for(int j = 0;j < map[i].length;j++) {
				System.out.print(map[i][j]+" ");//输出一行
				
			}
			System.out.println();
		}
	}
}
class T2{
	//使用递归回溯思想来解决
	/* 1 findWay方法就是专门来找出迷宫的路径
	 * 2 如果找到就是true，否则就返回false
	 * 3 map就是二维数组，即表示迷宫
	 * 4 i,j就是老鼠的位置，初始化位1，1
	 * 5 应为是递归找路，所以需要规定一些规则
	 * 0表示可以走 1表示障碍物 2表示可以走 3表示走过但是是死路
	 * 6 当map[6][5]的时候说明找到通路可以结束，否则继续寻找
	 * 7 先确定老鼠找路的策略 下 有 上 左
	 */
	public boolean findWay(int[][] map,int i,int j) {
		if(map[6][5] == 2) {//说明已经找到
			return true;
		}else {
			if(map[i][j] == 0) {//当前位置为0，说明位置可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略确定是否真的可以走通
				if(findWay(map,i + 1,j)) {//先走下
					return true;
				}else if(findWay(map,i,j + 1)) {//右
					return true;
				}else if(findWay(map,i - 1,j)) {//上
					return true;
				}else if(findWay(map,i,j - 1)) {//左
					return true;
				}else {
					map[i][j] = 3;
					return false;
				}
			}else {//map[i][j]=1,2,3
				return false;
			}
		}
	}
}