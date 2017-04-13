package com.yardspoon.logmill.screen.viewer;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yardspoon.logmill.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ViewerActivityInstrumentedTest {

    @Rule
    public ActivityTestRule<ViewerActivity> rule = new ActivityTestRule<>(ViewerActivity.class);

    private ViewerActivity testObject;

    @Before
    public void setup() {
        testObject = rule.getActivity();
    }

    @Test
    public void fabClickLoadsLogsFromPresenter() {
        View fab = testObject.findViewById(R.id.pickAppFab);
        RecyclerView logList = (RecyclerView) testObject.findViewById(R.id.logList);

        fab.callOnClick();

        assertEquals(1000, logList.getAdapter().getItemCount());
    }
}
