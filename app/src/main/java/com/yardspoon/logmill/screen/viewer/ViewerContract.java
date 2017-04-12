package com.yardspoon.logmill.screen.viewer;


public interface ViewerContract {
    interface View {
        void showLogs();
    }

    interface Presenter {
        void loadLogs();
    }
}
