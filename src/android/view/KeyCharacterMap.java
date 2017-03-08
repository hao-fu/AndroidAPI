//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.view;

import android.view.KeyEvent;

public class KeyCharacterMap {
    public static final int BUILT_IN_KEYBOARD = 0;
    public static final int NUMERIC = 1;
    public static final int PREDICTIVE = 2;
    public static final int ALPHA = 3;
    public static final char HEX_INPUT = '\uef00';
    public static final char PICKER_DIALOG_INPUT = '\uef01';
    public static final int COMBINING_ACCENT = -2147483648;
    public static final int COMBINING_ACCENT_MASK = 2147483647;

    KeyCharacterMap() {
        throw new RuntimeException("Stub!");
    }

    public static KeyCharacterMap load(int keyboard) {
        throw new RuntimeException("Stub!");
    }

    public int get(int keyCode, int meta) {
        throw new RuntimeException("Stub!");
    }

    public char getNumber(int keyCode) {
        throw new RuntimeException("Stub!");
    }

    public char getMatch(int keyCode, char[] chars) {
        throw new RuntimeException("Stub!");
    }

    public char getMatch(int keyCode, char[] chars, int modifiers) {
        throw new RuntimeException("Stub!");
    }

    public char getDisplayLabel(int keyCode) {
        throw new RuntimeException("Stub!");
    }

    public static int getDeadChar(int accent, int c) {
        throw new RuntimeException("Stub!");
    }

    public boolean getKeyData(int keyCode, KeyCharacterMap.KeyData results) {
        throw new RuntimeException("Stub!");
    }

    public KeyEvent[] getEvents(char[] chars) {
        throw new RuntimeException("Stub!");
    }

    public boolean isPrintingKey(int keyCode) {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public int getKeyboardType() {
        throw new RuntimeException("Stub!");
    }

    public static boolean deviceHasKey(int keyCode) {
        throw new RuntimeException("Stub!");
    }

    public static boolean[] deviceHasKeys(int[] keyCodes) {
        throw new RuntimeException("Stub!");
    }

    public static class KeyData {
        public static final int META_LENGTH = 4;
        public char displayLabel;
        public char number;
        public char[] meta = null;

        public KeyData() {
            throw new RuntimeException("Stub!");
        }
    }
}
