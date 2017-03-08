//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.content.res;

import android.content.res.AssetFileDescriptor;
import android.content.res.XmlResourceParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class AssetManager {
    public static final int ACCESS_UNKNOWN = 0;
    public static final int ACCESS_RANDOM = 1;
    public static final int ACCESS_STREAMING = 2;
    public static final int ACCESS_BUFFER = 3;

    public AssetManager() {
    }

    public void close() {
    }

    public final InputStream open(String fileName) throws IOException {
    	// FIXME
    	InputStream is = new ByteArrayInputStream("1234567890".getBytes("UTF-8"));

    	return is;
    }

    public final InputStream open(String fileName, int accessMode) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public final AssetFileDescriptor openFd(String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public final native String[] list(String var1) throws IOException;

    public final AssetFileDescriptor openNonAssetFd(String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public final AssetFileDescriptor openNonAssetFd(int cookie, String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public final XmlResourceParser openXmlResourceParser(String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public final XmlResourceParser openXmlResourceParser(int cookie, String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }

    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }

    public final native String[] getLocales();

    public final class AssetInputStream extends InputStream {
        AssetInputStream() {
            throw new RuntimeException("Stub!");
        }

        public final int getAssetInt() {
            throw new RuntimeException("Stub!");
        }

        public final int read() throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final boolean markSupported() {
            throw new RuntimeException("Stub!");
        }

        public final int available() throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final void close() throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final void mark(int readlimit) {
            throw new RuntimeException("Stub!");
        }

        public final void reset() throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final int read(byte[] b) throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final int read(byte[] b, int off, int len) throws IOException {
            throw new RuntimeException("Stub!");
        }

        public final long skip(long n) throws IOException {
            throw new RuntimeException("Stub!");
        }

        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
}
