package com.yardspoon.logmill.screen.viewer;

import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yardspoon.logmill.R;
import com.yardspoon.logmill.models.Logcat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ViewerActivityInstrumentedTest {

    @Rule public ActivityTestRule<ViewerActivity> activityRule = new ActivityTestRule<>(ViewerActivity.class);

    @Mock ViewerPresenter mockViewerPresenter;

    private ViewerActivity testObject;

    @Before
    public void setup() {
        testObject = activityRule.getActivity();
        testObject.presenter = mockViewerPresenter;
    }

    @Test
    public void fabClickLoadsLogsFromPresenter() {
        View fab = testObject.findViewById(R.id.pickAppFab);

        fab.callOnClick();

        verify(mockViewerPresenter).loadLogs();
    }

    @Test
    @UiThreadTest
    public void showsLogsInRecycler() {
        RecyclerView recycler = (RecyclerView) testObject.findViewById(R.id.log_list);

        Logcat logcat = new Logcat();

        testObject.showLogs(logcat);

        assertEquals(logcat.getLogs().size(), recycler.getAdapter().getItemCount());
    }
}
