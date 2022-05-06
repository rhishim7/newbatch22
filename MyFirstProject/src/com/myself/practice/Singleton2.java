package com.myself.practice;
public class Singleton2 {

private int a;
private int b;
static Singleton2 obj=new Singleton2();
private Singleton2() {

}
public int getA() {
return a;
}
public void setA(int a) {
this.a = a;
}
public int getB() {
return b;
}
public void setB(int b) {
this.b = b;
}
public static Singleton2 getObj() {
return obj;
}
public static void setObj(Singleton2 obj) {
Singleton2.obj = obj;
}
public void add(int a, int b) {
int c=0;
c=a+b;
System.out.println(c);
}
}