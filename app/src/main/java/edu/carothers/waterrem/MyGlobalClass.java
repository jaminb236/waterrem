package edu.carothers.waterrem;

import android.app.Application;

public class MyGlobalClass extends Application {
    public int mygoal;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public int getmygoal() {
        return mygoal;
    }

    public void setmygoal(int mygoal) {
        this.mygoal = mygoal;
    }
}