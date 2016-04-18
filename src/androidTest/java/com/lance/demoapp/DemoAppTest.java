package com.lance.demoapp;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.lance.demoapp.DemoAppTest \
 * com.lance.demoapp.tests/android.test.InstrumentationTestRunner
 */
public class DemoAppTest extends ActivityInstrumentationTestCase2<DemoApp> {

    public DemoAppTest() {
        super("com.lance.demoapp", DemoApp.class);
    }

}
