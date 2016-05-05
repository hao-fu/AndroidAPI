package java.net;

public class URL {
	String param;
	public URL(String param) {
		this.param = param;
		throw new RuntimeException();
	}
	
	public HttpURLConnection openConnection() {
		System.err.println("MYURL " + param);
		return null;
	}

}
