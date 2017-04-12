package com.yardspoon.logmill.screen.viewer;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {ViewerModule.class})
public interface ViewerSubComponent extends AndroidInjector<ViewerActivity> {
    @Subcomponent.Builder abstract class Builder extends AndroidInjector.Builder<ViewerActivity> { }
}
