package com.myself.practice;
public class Singleton {
public static void main(String args[]) {
Singleton2 st=Singleton2.getObj();
Singleton2 st2=Singleton2.getObj();
st.add(5, 5);
st2.add(2, 3);
}
}