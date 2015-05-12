package com.test.whenneedtostatic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

    private static final boolean HOW_TO_CHOOSE = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (HOW_TO_CHOOSE) {
            RightActiivty.startInRightWay(this);
        } else {
            Intent intent = new Intent(this, WrongActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(WrongActivity.KEY_WRONG, "iAmWrong");
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

}
