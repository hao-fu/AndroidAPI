package android.util;

public class DisplayMetrics {
    public static final int DENSITY_LOW = 120;
    public static final int DENSITY_MEDIUM = 160;
    public static final int DENSITY_HIGH = 240;
    public static final int DENSITY_XHIGH = 320;
    public static final int DENSITY_DEFAULT = 160;
    public int widthPixels;
    public int heightPixels;
    public float density;
    public int densityDpi;
    public float scaledDensity;
    public float xdpi;
    public float ydpi;

    public DisplayMetrics() {
    	widthPixels = 640;
    	heightPixels = 480;
    }

    public void setTo(DisplayMetrics o) {
        throw new RuntimeException("Stub!");
    }

    public void setToDefaults() {
        throw new RuntimeException("Stub!");
    }
}