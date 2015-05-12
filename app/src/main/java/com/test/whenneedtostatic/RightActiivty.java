package com.test.whenneedtostatic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by rex.yau on 5/12/2015.
 */
public class RightActiivty extends Activity {

    private static final String TAG = "RightActivity";
    private static final String KEY_RIGHT = "iAmRight";

    private String mKey;

    public static void startInRightWay(Activity activity) {
        Intent intent = new Intent(activity, RightActiivty.class);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_RIGHT, "iAmRight");
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mKey = bundle.getString(KEY_RIGHT);
        } else {
            throw new RuntimeException("WantBundle");
        }

        Log.d(TAG, "checkKey->" + mKey);
    }
}
