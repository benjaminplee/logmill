package com.yardspoon.logmill.screen.viewer;


import com.yardspoon.logmill.models.Logcat;

public interface ViewerMVPContract {
    interface View {
        void showLogs(Logcat logcat);

        void problemLoadingLogs();

        void logsLoaded();

        void loading();
    }

    interface Presenter {
        void loadLogs();
    }
}
