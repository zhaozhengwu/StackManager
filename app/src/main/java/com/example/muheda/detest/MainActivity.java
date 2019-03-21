package com.example.muheda.detest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.muheda.detest.linkedStorage.LinkList;
import com.example.muheda.detest.sequentialStorage.StackSequential;

public class MainActivity extends AppCompatActivity {
    public StackSequential mStackSequential;
    public LinkList mLinkList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sequential();
        link();
    }
    //顺序存储结构
    public void sequential(){
        mStackSequential=new StackSequential(10);
        mStackSequential.pull(1);
        mStackSequential.pull(2);
        mStackSequential.pull(3);
        mStackSequential.pull(4);

        while (!mStackSequential.isEmpty()){

            Log.d("--栈--","--顺序存储结构出栈--"+mStackSequential.pop());
        }

    }
    //链式存储结构
    public void link(){
        mLinkList=new LinkList();
        mLinkList.pull(1);
        mLinkList.pull(2);
        mLinkList.pull(3);
        mLinkList.pull(4);

        while (!mLinkList.isEmpty()){

            Log.d("--栈--","--链式存储结构出栈--"+mLinkList.pop());

        }
    }
}
