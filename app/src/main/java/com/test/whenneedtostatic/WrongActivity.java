package com.test.whenneedtostatic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by rex.yau on 5/12/2015.
 */
public class WrongActivity extends Activity {

    public static final String KEY_WRONG = "wrong";
    private static final String TAG = "WrongActivity";

    private String mKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mKey = bundle.getString(KEY_WRONG);
        }

        Log.d(TAG, "checkKey->" + mKey);

    }
}
