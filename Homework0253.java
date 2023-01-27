public class Homework0253{
	public static void main(String[] args) {
		Book book = new Book("包子语录",300);
		book.info();
		book.updatePrice();//更新
		book.info();
	}
}
class Book{
	String name;
	double price;
	public Book(String name ,double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
	//显示书籍情况
	public void info() {
		System.out.println("书名="+this.name+"价格="+ this.price);
	}
}

	
