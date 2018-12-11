package com.example.zsl.activitysplit;

import android.app.Activity;
import android.os.Bundle;

import com.example.zsl.activitysplit.utils.ActivitySplitAnimationUtil;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Preparing the 2 images to be split
        ActivitySplitAnimationUtil.prepareAnimation(this);

        setContentView(R.layout.act_two);

        // Animating the items to be open, revealing the new activity
        ActivitySplitAnimationUtil.animate(this, 1000);
    }

    @Override
    protected void onStop() {
        // If we're currently running the entrance animation - cancel it
        ActivitySplitAnimationUtil.cancel();

        super.onStop();    //To change body of overridden methods use File | Settings | File Templates.

    }

    @Override
    public void finish() {
//        super.finish();
//        setResult(111);

        ActivitySplitAnimationUtil.prepareAnimation(this);
        ActivitySplitAnimationUtil.animate2(this, 1000);
    }
}
