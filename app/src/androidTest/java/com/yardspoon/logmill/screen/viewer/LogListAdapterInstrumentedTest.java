package com.yardspoon.logmill.screen.viewer;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.widget.FrameLayout;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class LogListAdapterInstrumentedTest {

    private LogListAdapter testObject;
    private List<String> logs = Arrays.asList("a", "b", "c");
    private Context context;

    @Before
    public void setup() {
        testObject = new LogListAdapter(logs);
        context = InstrumentationRegistry.getInstrumentation().getTargetContext().getApplicationContext();
    }

    @Test
    public void getItemCount() {
        assertEquals(3, testObject.getItemCount());
    }

    @Test
    public void onCreateViewHolder() {
        FrameLayout viewGroup = new FrameLayout(context);

        LogListAdapter.ViewHolder viewHolder = testObject.onCreateViewHolder(viewGroup, 0);

        assertNotNull(viewHolder);
        assertNotNull(viewHolder.text);
    }

    @Test
    public void onBindViewHolder() {
        FrameLayout viewGroup = new FrameLayout(context);
        LogListAdapter.ViewHolder viewHolder = testObject.onCreateViewHolder(viewGroup, 0);

        testObject.onBindViewHolder(viewHolder, 0);
        assertEquals("a", viewHolder.text.getText());
        testObject.onBindViewHolder(viewHolder, 1);
        assertEquals("b", viewHolder.text.getText());
        testObject.onBindViewHolder(viewHolder, 2);
        assertEquals("c", viewHolder.text.getText());
    }
}
