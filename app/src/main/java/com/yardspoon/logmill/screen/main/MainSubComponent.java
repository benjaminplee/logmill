package com.yardspoon.logmill.screen.main;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {MainModule.class})
public interface MainSubComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> { }
}
