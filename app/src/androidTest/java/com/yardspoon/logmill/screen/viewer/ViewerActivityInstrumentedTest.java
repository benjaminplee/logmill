package com.yardspoon.logmill.screen.viewer;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import com.yardspoon.logmill.R;
import com.yardspoon.logmill.base.ApplicationComponent;
import com.yardspoon.logmill.base.LogMillApplication;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import it.cosenonjaviste.daggermock.DaggerMockRule;

import static org.mockito.Mockito.verify;

@RunWith(AndroidJUnit4.class)
public class ViewerActivityInstrumentedTest {

    @Rule public ActivityTestRule<ViewerActivity> activityRule = new ActivityTestRule<>(ViewerActivity.class);
    @Rule public DaggerMockRule<ApplicationComponent> mockDIRule = new DaggerMockRule<>(ApplicationComponent.class).set(new DaggerMockRule.ComponentSetter<ApplicationComponent>() {
        @Override public void setComponent(ApplicationComponent component) {
            component.inject((LogMillApplication) InstrumentationRegistry.getInstrumentation().getTargetContext().getApplicationContext());
        }
    });

    @Mock ViewerPresenter mockViewerPresenter;

    private ViewerActivity testObject;

    @Before
    public void setup() {
        testObject = activityRule.getActivity();
    }

    @Test
    public void fabClickLoadsLogsFromPresenter() {
        View fab = testObject.findViewById(R.id.pickAppFab);

        fab.callOnClick();

        verify(mockViewerPresenter).loadLogs();
    }
}
