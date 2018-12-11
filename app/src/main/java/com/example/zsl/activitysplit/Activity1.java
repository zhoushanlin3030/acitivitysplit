package com.example.zsl.activitysplit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zsl.activitysplit.utils.ActivitySplitAnimationUtil;

public class Activity1 extends Activity {

    public View mParent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_one);
        mParent = findViewById(R.id.parent);
        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivitySplitAnimationUtil
                        .startActivity(Activity1.this, new Intent(Activity1.this,
                                                                   Activity2.class));
            }
        });
    }

}
