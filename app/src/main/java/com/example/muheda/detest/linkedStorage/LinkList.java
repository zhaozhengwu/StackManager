package com.example.muheda.detest.linkedStorage;

/**
 * Created by 13660 on 2019/3/21.
 * 链式存储结构实现栈
 */

public class LinkList {
    private Link firstLink;
    //入栈
    public void pull(int element){
        Link newLink=new Link(element);
        newLink.next=firstLink;
        firstLink=newLink;
    }
    //出栈
    public int pop(){
        int value;
        value=firstLink.value;
        Link temp=null;
        temp=firstLink.next;
        firstLink=temp;
        return value;
    }
     public boolean isEmpty(){
        if (firstLink==null){
            return true;
        }

        return false;
     }
}
