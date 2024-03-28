/*
  
 */
package com.gettersetter;

/*
  
 */
public class Person {
	String name;
	int age;
	double salary;


//	public Person(String name, int age, double salary) {
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if (age < 0) {
			return 0;
		}
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
	}
	
	
}
