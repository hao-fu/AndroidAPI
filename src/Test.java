import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;



public class Test {
	public String getQueData() throws IllegalArgumentException {
	    String message = null;
	    try {           
	        HttpClient httpclient = new DefaultHttpClient(); 
	        

	        String url = "working - url";
	        HttpResponse response = null;
	        response = httpclient.execute(new HttpGet(url));
	        
	        
	    	URL url1 = new URL(url);
	    	HttpURLConnection conn = (HttpURLConnection) url1.openConnection(); //sink, leak
	        conn.setRequestMethod("GET");
	        conn.setDoInput(true);

	      } catch (Exception e) {
	    message = e.toString();
	    }
	    return message;
	}
}
