// Java ke andar koi bhi class private / protected nahi hoti, sirf public / default hi ho sakti he

// class Vehicle {}
// class Car extends Vehicle {}
// Vehicle v = new Vehicle();
// Car c = new Car();
// Vehicle v1 = new Car(); // Valid
// Car c1 = new Vehicle(); // Invalid -> Run Time Error

// public class OOPS {
// public static void main(String[] args) {
// Pen p1 = new Pen(); // Created an object p1 of class Pen
// p1.setColor("Blue");
// System.out.println(p1.getColor());
// p1.setTip(5);
// System.out.println(p1.getTip());
// p1.setColor("Red");

// BankAccount myAcc = new BankAccount();
// myAcc.username = "Saurav";
// // myAcc.password = "1234"; // This will give an error as password is private
// myAcc.setPassword("1234");

// }
// }

// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

// class Pen {
// private String color;
// private int tip;

// String getColor() {
// return this.color;
// }

// int getTip() {
// return this.tip;
// }

// void setColor(String newColor) {
// color = newColor;
// }

// void setTip(int tip) {
// this.tip = tip;
// }
// }
// ----------------------------------------------------------------------------------------

// Constructors in Java
// public class OOPS {
// public static void main(String[] args) {
// Student s1 = new Student();
// Student s2 = new Student("Swayam");
// Student s3 = new Student(8);

// s1.name = "Swayam";
// s1.roll = 8;
// s1.password = "1234";

// s1.marks[0] = 95;
// s1.marks[1] = 90;
// s1.marks[2] = 100;

// Student s4 = new Student(s1);
// s4.password = "0987";

// s1.marks[0] = 100;

// for (int i = 0; i < 3; i++) {
// System.out.println(s4.marks[i]);
// }

// }
// }

// class Student {
// String name;
// int roll;
// String password;
// int marks[];

// // Default Constructor
// Student() {
// marks = new int[3];
// System.out.println("Default Constructor is called...");
// }

// // Parameterized Constructor
// Student(String name) {
// marks = new int[3];
// this.name = name;
// System.out.println("Parameterised Constructor is called...");
// }

// Student(int roll) {
// marks = new int[3];
// this.roll = roll;
// System.out.println("Parameterised Constructor is called...");
// }

// // // Shallow Copy Constructor
// // Student(Student s1) {
// // marks = new int[3];
// // this.name = s1.name;
// // this.roll = s1.roll;
// // this.marks = s1.marks;
// // }

// // Deep Copy Constructor
// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// for (int i = 0; i < marks.length; i++) {
// this.marks[i] = s1.marks[i];
// }
// }
// }
// ----------------------------------------------------------------------------------------

// Inheritance in Java
// public class OOPS {
// public static void main(String[] args) {
// // Fish shark = new Fish();
// // shark.eat();
// Dog dobby = new Dog();
// dobby.eat();
// dobby.legs = 4;
// System.out.println(dobby.legs);
// }
// }

// // Base Class
// class Animal {
// String color;

// void eat() {
// System.out.println("eats");
// }

// void breathe() {
// System.out.println("breathes");
// }
// }

// // Derived Class
// class Mammals extends Animal {
// int legs;
// }

// // Multi-Level Inheritance
// // Derived Class
// class Dog extends Mammals {
// String breed;
// }

// // // Single Inheritance
// // // Derived Class
// // class Fish extends Animal {
// // int fins;

// // void swim() {
// // System.out.println("swims");
// // }
// // }

// // Hybrid Inheritance
// // Derived Class
// class Fish extends Animal {
// void swim() {
// System.out.println("swims");
// }
// }

// // Derived Class
// class Carnivores extends Animal {
// void walk() {
// System.out.println("walks");
// }
// }

// // Derived Class
// class Bird extends Animal {
// void fly() {
// System.out.println("flies");
// }
// }

// Multiple Inheritance (Supported in C++ but not in Java)(In java we can
// achieve multiple inheritance using interfaces)

// ----------------------------------------------------------------------------------------

// Polymorphism in Java
// Compile Time Polymorphism (Method Overloading)
// Run Time Polymorphism (Method Overriding)

// public class OOPS {
// public static void main(String[] args) {
// // Calculator calc = new Calculator();
// // System.out.println(calc.sum(1, 2));
// // System.out.println(calc.sum(1.5f, 7.3f));
// // System.out.println(calc.sum(1, 2, 3));

// Deer d = new Deer();
// d.eat();
// }
// }

// // Method Overloading
// class Calculator {
// int sum(int a, int b) {
// return a + b;
// }

// float sum(float a, float b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;
// }
// }

// // Method Overriding
// class Animal {
// void eat() {
// System.out.println("eats anything");
// }
// }

// class Deer extends Animal {
// void eat() {
// System.out.println("eats grass");
// }
// }
// ----------------------------------------------------------------------------------------

// // Packages in Java
// package mypackage; 

// import java.util.*;

// public class OOPS {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// }
// }
// ----------------------------------------------------------------------------------------

// // Abstraction in Java
// public class OOPS {
// public static void main(String[] args) {
// // Horse h = new Horse();
// // h.eat();
// // h.walk();
// // System.out.println(h.color);

// // Chicken c = new Chicken();
// // c.eat();
// // c.walk();
// // System.out.println(c.color);

// Mustang myHorse = new Mustang();
// // Animal -> Horse -> Mustang
// }
// }

// // Abstract Class (We can't create an object of an abstract class)
// abstract class Animal {
// String color;

// // Constructor of an abstract class
// Animal() {
// System.out.println("Animal Constructor is called...");
// color = "brown";
// }

// void eat() {
// System.out.println("animal eats");
// }

// // Abstract Method (Method without body)
// abstract void walk();
// }

// class Horse extends Animal {
// Horse() {
// System.out.println("Horse Constructor is called...");
// }

// void walk() {
// System.out.println("Walks on 4 legs");
// }

// void changeColor() {
// color = "black";
// }
// }

// class Chicken extends Animal {
// Chicken() {
// System.out.println("Chicken Constructor is called...");
// }

// void walk() {
// System.out.println("Walks on 2 legs");
// }

// void changeColor() {
// color = "white";
// }
// }

// class Mustang extends Horse {
// Mustang() {
// System.out.println("Mustang Constructor is called...");
// }
// }
// ----------------------------------------------------------------------------------------

// // Interfaces in Java
// public class OOPS {
// public static void main(String[] args) {
// Queen q = new Queen();
// q.moves();
// }
// }

// interface ChessPlayer {
// void moves();
// }

// class Queen implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right, diagonal - (in all 4
// directions)");
// }
// }

// class Rook implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right");
// }
// }

// class King implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right, diagonal - (by 1 step)");
// }
// }
// ----------------------------------------------------------------------------------------

// // Multiple Inheritance using Interfaces
// interface Herbivores {

// }

// interface Omnivores {

// }

// interface Carnivores {

// }

// class Human implements Herbivores, Omnivores {

// }

// class Bear implements Omnivores, Carnivores {

// }
// ----------------------------------------------------------------------------------------

// // Static keyword in Java
// public class OOPS {
// // main func bhi static hota he kyuki hum public class ka keval ek hi main
// func
// // chahte he.
// public static void main(String[] args) {
// Student s1 = new Student();
// s1.schoolName = "XYZ School";
// System.out.println(s1.schoolName);

// Student s2 = new Student();
// System.out.println(s2.schoolName);

// Student s3 = new Student();
// s3.schoolName = "ABC School";
// System.out.println(s3.schoolName);
// System.out.println(s1.schoolName);
// }
// }

// class Student {

// static int returnPercentage(int math, int phy, int chem) {
// return (math + phy + chem) / 3;
// }

// String name;
// int roll;

// static String schoolName; // Static keyword sare objects ke liye keval ek hi
// schoolName variable banayega
// // aur usi ko share karega, isliye sare objects ke schoolName same hoga, agar
// // kisi object ne schoolName ko change kiya to sare objects ke schoolName
// change
// // ho jayenge

// void setName() {
// this.name = "Joesph";
// }

// String getName() {
// return this.name;
// }
// }
//----------------------------------------------------------------------------------------

//Super keyword in Java
public class OOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor is called...");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        super.color = "brown";
        // Jab super nahi likhte toh java by default super() call karta he
        System.out.println("Horse Constructor is called...");
    }
}
// ----------------------------------------------------------------------------------------

// Constructor Chaining in Java (Calling one constructor from another
// constructor) - Self Study