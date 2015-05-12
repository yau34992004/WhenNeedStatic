package com.test.whenneedtostatic;

import android.content.Context;

/**
 * Created by rex.yau on 5/12/2015.
 */
public class DemoSingleton {

    private static DemoSingleton mSingleton;
    private Context mContext;

    private DemoSingleton(Context context) {
        mContext = context;
    }

    public static DemoSingleton getInstance(Context context) {

        if (mSingleton == null) {
            synchronized (DemoSingleton.class) {
                mSingleton = new DemoSingleton(context.getApplicationContext());
            }
        }
        return mSingleton;
    }
}
