package com.qa.advanced.collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[]args){

        Stack <String> st=new Stack<String>();

        st.push("Jyoti");
        st.push("Rupam");
        st.push("Sheetal");
        st.push("Harendra");
        st.push("Satyam");

        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());;
        System.out.println(st.peek());

        st.push("Sarvesh");

        System.out.println(st.size());;
        System.out.println(st.peek());
        System.out.println(st);;




    }


}
