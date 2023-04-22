package com.hspedu.collection_;

import java.util.Vector;
@SuppressWarnings("all")
public class Vector_ {
	
	public static void main(String[] args) {
		//无参构造器
		
		Vector vector = new Vector();
		for (int i = 0; i < 10; i++) {
			vector.add(i);
			
		}
		
		
		/*
		1. new Vector(){
			this(10);
			}
		2. vector.add(i)
		2.1//下面这个方法就添加数据到集合
		 public synchronized boolean add(E e) {
        modCount++;
        add(e, elementData, elementCount);
        return true;
    }
    2.2 //确定是否需要扩容 条件 ： minCapacity - elementData.length>0
private void ensureCapacityHelper(int minCapacity) {
// overflow-conscious code
if (minCapacity - elementData.length > 0)
grow(minCapacity);
}
2.3 //如果 需要的数组大小 不够用，就扩容 , 扩容的算法
//newCapacity = oldCapacity + ((capacityIncrement > 0) ?
// capacityIncrement : oldCapacity);
//就是扩容两倍. private void grow(int minCapacity) {
// overflow-conscious code 
int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
capacityIncrement : oldCapacity);
if (newCapacity - minCapacity < 0)     
newCapacity = minCapacity;
if (newCapacity - MAX_ARRAY_SIZE > 0)
newCapacity = hugeCapacity(minCapacity);
elementData = Arrays.copyOf(elementData, newCapacity);
}
		*/
	}
}
