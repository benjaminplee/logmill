package com.yardspoon.logmill.screen.viewer;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ViewerActivityInstrumentedTest {

    @Rule ActivityTestRule<ViewerActivity> rule = new ActivityTestRule<>(ViewerActivity.class);

    @Test
    public void fabClickLoadsLogsFromPresenter() throws Exception {

    }
}
