package com.arrays;
class Student {
	String name;
	int num;
	int score;
	
	public Student(String name, int num, int score) {
	
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", score=" + score + "]";
	}
		
}


public class DemoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s1 = new Student[3];
		Student std1 = new Student("Aniket",22,11);
		Student std2 = new Student("Ayush",21,32);
		Student std3 = new Student("Ayush11",21,39);
		
		s1[0] = std1;
		s1[1] = std2;
		
//		for (int i = 0; i < 2; i++) {
//			System.out.println(s1[i]);
//		}
		
		
		
		System.out.println(f1(s1));
		
		
 		

	}
	
public static Student f1(Student[] s1)
{
	Student max = new Student("A",1,2);
	for (int i =0; i<s1.length - 2;++i) {
		if (s1[i].score < s1[i+1].score) {
			max = s1[i+1];
		}
		else {
			max = s1[i];
		}
		
		
	}
	return max;
	
	


}
}
