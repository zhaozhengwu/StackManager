package com.example.muheda.detest.sequentialStorage;

/**
 * Created by 13660 on 2019/3/21.
 * 栈的顺序存储结构实现 数组
 */

public class StackSequential {
    private int[] stackData;
    //设置数组的长度
    private int maxSize;
    //栈顶位置记录
    private int top=-1;

    public StackSequential(int maxSize){
        this.maxSize=maxSize;
        stackData=new int[maxSize];
    }
    //进栈
    public void pull(int element){
        top++;
        stackData[top]=element;
    }
    //出栈
    public int pop(){

        return stackData[top--];
    }
    //获取栈顶元素
    public int peek(){
        return stackData[top];
    }
    //是否为空栈
    public boolean isEmpty(){
        return (top==-1);
    }
    //是否溢出
    public boolean isFull(){
        return (top==maxSize-1);
    }

}
