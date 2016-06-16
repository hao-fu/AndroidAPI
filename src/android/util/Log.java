/*    */package android.util;

/*    */
/*    */public final class Log {
	/* 4 */Log() {
		throw new RuntimeException("Stub!");
	}

	/* 5 */public static int v(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 6 */public static int v(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}
	
	/* 7 */public static int d(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 8 */public static int d(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 9 */public static int i(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 10 */public static int i(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 11 */public static int w(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 12 */public static int w(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/*    */public static boolean isLoggable(String paramString,
			int paramInt) {
				return true;
			}

	/* 14 */public static int w(String tag, Throwable tr) {
		System.out.println(tag + "--" + tr.getMessage());
		return 1;
	}

	/* 15 */public static int e(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 16 */public static int e(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 17 */public static int wtf(String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 18 */public static int wtf(String tag, Throwable tr) {
		System.out.println(tag + "--" + tr.getMessage());
		return 1;
	}

	/* 19 */public static int wtf(String tag, String msg, Throwable tr) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/* 20 */public static String getStackTraceString(Throwable tr) {
		return tr.getMessage();
	}

	/* 21 */public static int printlnln(int priority, String tag, String msg) {
		System.out.println(tag + "--" + msg);
		return 1;
	}

	/*    */
	/*    */public static final int VERBOSE = 2;
	/*    */public static final int DEBUG = 3;
	/*    */public static final int INFO = 4;
	/*    */public static final int WARN = 5;
	/*    */public static final int ERROR = 6;
	/*    */public static final int ASSERT = 7;
	/*    */
}

/*
 * Location:
 * C:\Users\hao\Downloads\android-sdk-windows\platforms\android-19\android.jar
 * Qualified Name: android.util.Log Java Class Version: 5 (49.0) JD-Core
 * Version: 0.7.1
 */