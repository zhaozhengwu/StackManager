package com.example.muheda.detest.linkedStorage;

import android.util.Log;

/**
 * Created by 13660 on 2019/3/21.
 */

public class Link {
    public int value;
    public Link next;
    public Link(int value){
        this.value=value;
    }

    public void displayLink(){
        Log.d("----链式存储-----",value+"");
    }

}
