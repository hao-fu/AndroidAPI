package android.content;

import java.util.HashMap;
import java.util.Map;

public class Intent {
	String action;
	Map<String, Object> values;

	public Intent(String action) {
		this.action = action;
		values = new HashMap<>();
	}

	public Intent putExtra(String name, String value) {
		values.put(name, value);
		return this;
	}
	
	public String getStringExtra(String name) {
		return (String) values.get(name);
	}
	
	public String getAction() {
		return action;
	}
	
	@Override
	public String toString() {
		return "[intent:" + action + ", " + values + "]";
	}

}
