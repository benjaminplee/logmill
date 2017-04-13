package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.models.Logcat;

public interface ViewerContract {
    interface View {
        void showLogs(Logcat logcat);
    }

    interface Presenter {
        void loadLogs();
    }
}
