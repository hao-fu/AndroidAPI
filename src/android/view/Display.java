//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.view;

import android.util.DisplayMetrics;

public class Display {
    public static final int DEFAULT_DISPLAY = 0;

    Display() {
    }

    public int getDisplayId() {
    	return 1;
    }

    public int getWidth() {
    	return 480;
    }

    public int getHeight() {
    	return 640;
    }

    public int getRotation() {
        return 1;
    }

    public int getOrientation() {
    	return 1;
    }

    public int getPixelFormat() {
        throw new RuntimeException("Stub!");
    }

    public float getRefreshRate() {
        throw new RuntimeException("Stub!");
    }

    public void getMetrics(DisplayMetrics outMetrics) {
    }
}
