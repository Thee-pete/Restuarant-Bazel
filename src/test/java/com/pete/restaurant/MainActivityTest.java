package com.pete.restaurant;

import android.app.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(AndroidJunit4.class)

public class MainActivityTest {
    @Test
    public void testOnCreateNotNull(){
        ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
        Activity activity = controller.create().destroy().get();

        assertThat(activity).isNotNull();
    }
}