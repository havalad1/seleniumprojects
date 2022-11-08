package Day49_;

import java.util.PriorityQueue;

class Person implements Comparable {
	String name;
	double wealth;
	int age;
	public Person(String name, double wealth, int age) {
		this.name = name;
		this.wealth = wealth;
		this.age = age;
	}
	
	public String toString() {
		return "Person [name=" + name + ", wealth=" + wealth + ", age=" + age + "]";
	}

	public int compareTo(Object o) {
		Person pt=(Person)o;
		return pt.age-this.age;
	}
}

public class Program7 {
	public static void main(String[] args) {
		Person p1=new Person("sam", 3.45, 34);
		Person p2=new Person("ram", 45.36,46);
		Person p3=new Person("john",12.35,12);
		Person p4=new Person("jack",56.78,78);
		Person p5=new Person("mark",12.23,97);
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		pq.add(p4);
		pq.add(p5);
		
		int len=pq.size();
		for (int i = 0; i < len; i++) {
			Object ob=pq.poll();
			System.out.println(ob);
		}
	}
}
