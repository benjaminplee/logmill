package com.yardspoon.logmill.screen.viewer;

import com.yardspoon.logmill.models.Logcat;
import com.yardspoon.logmill.repository.LogcatRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ViewerPresenterTest {

    @Mock ViewerContract.View view;
    @Mock LogcatRepository repository;

    private ViewerPresenter testObject;

    @Before
    public void setup() {
        testObject = new ViewerPresenter(view, repository);
    }

    @Test
    public void loadedLogcatIsPassedToView() throws Exception {
        Logcat value = new Logcat();
        when(repository.load()).thenReturn(value);

        testObject.loadLogs();

        verify(view).showLogs(value);
    }
}