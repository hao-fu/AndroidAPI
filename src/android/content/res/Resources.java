package android.content.res;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

public class Resources {
	
	public Resources() {
		
	}
	
	public Resources(AssetManager assets, DisplayMetrics metrics,
			Configuration config) {
		throw new RuntimeException("Stub!");
	}

	public static Resources getSystem() {
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public CharSequence getQuantityText(int id, int quantity)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getString(int id) {
		if (id == 2131230724) {
			return "http://server.app.55tuan.com/server/";
		}
		return "[Res String: " + id + "]";
	}

	public String getString(int id, Object... formatArgs)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getQuantityString(int id, int quantity, Object... formatArgs)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getQuantityString(int id, int quantity)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public CharSequence getText(int id, CharSequence def) {
		throw new RuntimeException("Stub!");
	}

	public CharSequence[] getTextArray(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String[] getStringArray(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public int[] getIntArray(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainTypedArray(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public float getDimension(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelOffset(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public int getDimensionPixelSize(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public float getFraction(int id, int base, int pbase) {
		throw new RuntimeException("Stub!");
	}

	public Drawable getDrawable(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public Movie getMovie(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public int getColor(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public ColorStateList getColorStateList(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public boolean getBoolean(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public int getInteger(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getLayout(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getAnimation(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public XmlResourceParser getXml(int id) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public InputStream openRawResource(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public InputStream openRawResource(int id, TypedValue value)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public AssetFileDescriptor openRawResourceFd(int id)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public void getValue(int id, TypedValue outValue, boolean resolveRefs)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public void getValue(String name, TypedValue outValue, boolean resolveRefs)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public final Resources.Theme newTheme() {
		throw new RuntimeException("Stub!");
	}

	public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
		throw new RuntimeException("Stub!");
	}

	public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
		throw new RuntimeException("Stub!");
	}

	private DisplayMetrics displayMetrics;
	
	public DisplayMetrics getDisplayMetrics() {
		if (displayMetrics == null) {
			displayMetrics = new DisplayMetrics();
		}
		
		return displayMetrics;
	}

	private Configuration config;
	public Configuration getConfiguration() {
		if (config == null) {
			config = new Configuration();
		}
		
		return config;
	}

	public int getIdentifier(String name, String defType, String defPackage) {
		throw new RuntimeException("Stub!");
	}

	public String getResourceName(int resid) throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getResourcePackageName(int resid)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getResourceTypeName(int resid)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	public String getResourceEntryName(int resid)
			throws Resources.NotFoundException {
		throw new RuntimeException("Stub!");
	}

	/*
	 * public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle)
	 * throws XmlPullParserException, IOException { throw new
	 * RuntimeException("Stub!"); }
	 * 
	 * public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle
	 * outBundle) throws XmlPullParserException { throw new
	 * RuntimeException("Stub!"); }
	 */
	public final AssetManager getAssets() {
		throw new RuntimeException("Stub!");
	}

	public final void flushLayoutCache() {
		throw new RuntimeException("Stub!");
	}

	public final void finishPreloading() {
		throw new RuntimeException("Stub!");
	}

	public final class Theme {
		Theme() {
			throw new RuntimeException("Stub!");
		}

		public void applyStyle(int resid, boolean force) {
			throw new RuntimeException("Stub!");
		}

		public void setTo(Resources.Theme other) {
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(int[] attrs) {
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(int resid, int[] attrs)
				throws Resources.NotFoundException {
			throw new RuntimeException("Stub!");
		}

		public TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs,
				int defStyleAttr, int defStyleRes) {
			throw new RuntimeException("Stub!");
		}

		public boolean resolveAttribute(int resid, TypedValue outValue,
				boolean resolveRefs) {
			throw new RuntimeException("Stub!");
		}

		public void dump(int priority, String tag, String prefix) {
			throw new RuntimeException("Stub!");
		}

		protected void finalize() throws Throwable {
			throw new RuntimeException("Stub!");
		}
	}

	public static class NotFoundException extends RuntimeException {
		public NotFoundException() {
			throw new RuntimeException("Stub!");
		}

		public NotFoundException(String name) {
			throw new RuntimeException("Stub!");
		}
	}
}