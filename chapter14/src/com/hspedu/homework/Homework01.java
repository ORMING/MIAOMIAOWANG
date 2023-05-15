package com.hspedu.homework;

import java.util.ArrayList;
@SuppressWarnings("all")
public class Homework01 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new News("普京闪电战，基辅攻陷！绍伊古一战封神！"));
		arrayList.add(new News("俄罗斯敢直接拿下乌克兰正说明了美国的无力和虛弱。"));
		arrayList.add(new News("俄军好克制，看得我心疼，不行咱上核吧。"));
		arrayList.add(new News("搞笑，真以为闪电战是一个闪电的工夫就打完了？"));
		arrayList.add(new News("俄罗斯太善良了，怕伤害平民才进展这么慢。"));
		arrayList.add(new News("俄罗斯目的不是拿下乌克兰。"));
		arrayList.add(new News("乌克兰不宣而战，攻击俄罗斯本土，犯了战争罪。"));
		arrayList.add(new News("你乌克兰有本事打到莫斯科啊[哼]"));
		arrayList.add(new News("莫斯科号没有沉没，正在拖回基地"));
		
		int size = arrayList.size();
		for (int i = size -1; i >=0; i--) {
//			System.out.println(arrayList.get(i));
			News news = (News)arrayList.get(i);
			System.out.println(processTitle(news.getTitle()));
		}
			
		}
		//專門寫一個方法,處理實現新聞標題類 process處理
		
		public static String processTitle(String title) {
			if(title == null){
				return " ";
			}
			if(title.length() > 15) {
				return title.substring(0,15)+"...";//[0,15)
			}else {
				return title;
			}
		
		
	}
}
class News{
	public News(String title) {
		super();
		this.title = title;
	}
	private String title;
	private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "News [title=" + title + ", content=" + content + "]";
	}
	
	
}