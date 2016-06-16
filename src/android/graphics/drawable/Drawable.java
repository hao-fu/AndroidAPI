//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.graphics.drawable;

import android.content.res.Resources;

import java.io.InputStream;

public abstract class Drawable {
    public Drawable() {
        throw new RuntimeException("Stub!");
    }


    public void setBounds(int left, int top, int right, int bottom) {
        throw new RuntimeException("Stub!");
    }




    public void setChangingConfigurations(int configs) {
        throw new RuntimeException("Stub!");
    }

    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }

    public void setDither(boolean dither) {
        throw new RuntimeException("Stub!");
    }

    public void setFilterBitmap(boolean filter) {
        throw new RuntimeException("Stub!");
    }

    public final void setCallback(Drawable.Callback cb) {
        throw new RuntimeException("Stub!");
    }

    public Drawable.Callback getCallback() {
        throw new RuntimeException("Stub!");
    }

    public void invalidateSelf() {
        throw new RuntimeException("Stub!");
    }

    public void scheduleSelf(Runnable what, long when) {
        throw new RuntimeException("Stub!");
    }

    public void unscheduleSelf(Runnable what) {
        throw new RuntimeException("Stub!");
    }

    public abstract void setAlpha(int var1);


    public void clearColorFilter() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }

    public boolean setState(int[] stateSet) {
        throw new RuntimeException("Stub!");
    }

    public int[] getState() {
        throw new RuntimeException("Stub!");
    }

    public void jumpToCurrentState() {
        throw new RuntimeException("Stub!");
    }

    public Drawable getCurrent() {
        throw new RuntimeException("Stub!");
    }

    public final boolean setLevel(int level) {
        throw new RuntimeException("Stub!");
    }

    public final int getLevel() {
        throw new RuntimeException("Stub!");
    }

    public boolean setVisible(boolean visible, boolean restart) {
        throw new RuntimeException("Stub!");
    }

    public final boolean isVisible() {
        throw new RuntimeException("Stub!");
    }

    public abstract int getOpacity();

    public static int resolveOpacity(int op1, int op2) {
        throw new RuntimeException("Stub!");
    }


    protected boolean onStateChange(int[] state) {
        throw new RuntimeException("Stub!");
    }

    protected boolean onLevelChange(int level) {
        throw new RuntimeException("Stub!");
    }


    public int getIntrinsicWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getIntrinsicHeight() {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumWidth() {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumHeight() {
        throw new RuntimeException("Stub!");
    }


    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }

    public static Drawable createFromStream(InputStream is, String srcName) {
        throw new RuntimeException("Stub!");
    }

    
    public static Drawable createFromPath(String pathName) {
        throw new RuntimeException("Stub!");
    }



    public Drawable.ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }

    public abstract static class ConstantState {
        public ConstantState() {
            throw new RuntimeException("Stub!");
        }

        public abstract Drawable newDrawable();

        public Drawable newDrawable(Resources res) {
            throw new RuntimeException("Stub!");
        }

        public abstract int getChangingConfigurations();
    }

    public interface Callback {
        void invalidateDrawable(Drawable var1);

        void scheduleDrawable(Drawable var1, Runnable var2, long var3);

        void unscheduleDrawable(Drawable var1, Runnable var2);
    }
}
