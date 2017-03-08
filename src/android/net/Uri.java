//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.net;

import java.io.File;
import java.util.List;

public class Uri {
    public static final Uri EMPTY = null;

    String uri = "";
    
    Uri() {
    }
    
    Uri(String uri) {
    	this.uri = uri;
    }

    public  boolean isHierarchical() {
		return false;
	}

    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }

    public  boolean isRelative() {
		return false;
	}

    public boolean isAbsolute() {
        throw new RuntimeException("Stub!");
    }

    public  String getScheme() {
		return null;
	}

    public  String getSchemeSpecificPart() {
		return null;
	}

    public  String getEncodedSchemeSpecificPart() {
		return null;
	}

    public  String getAuthority() {
		return null;
	}

    public  String getEncodedAuthority() {
		return null;
	}

    public  String getUserInfo() {
		return null;
	}

    public  String getEncodedUserInfo() {
		return null;
	}

    public  String getHost() {
		return null;
	}

    public  int getPort() {
		return 0;
	}

    public  String getPath() {
		return null;
	}

    public  String getEncodedPath() {
		return null;
	}

    public  String getQuery() {
		return null;
	}

    public  String getEncodedQuery() {
		return null;
	}

    public  String getFragment() {
		return null;
	}

    public  String getEncodedFragment() {
		return null;
	}

    public  List<String> getPathSegments() {
		return null;
	}

    public  String getLastPathSegment() {
		return null;
	}

    public  Uri.Builder buildUpon() {
		return null;
	}

    public static Uri parse(String uriString) {
    	return new Uri(uriString);
    }

    public static Uri fromFile(File file) {
        throw new RuntimeException("Stub!");
    }

    public static Uri fromParts(String scheme, String ssp, String fragment) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getQueryParameters(String key) {
        throw new RuntimeException("Stub!");
    }

    public String getQueryParameter(String key) {
        throw new RuntimeException("Stub!");
    }

    public static String encode(String s) {
        throw new RuntimeException("Stub!");
    }

    public static String encode(String s, String allow) {
        throw new RuntimeException("Stub!");
    }

    public static String decode(String s) {
        throw new RuntimeException("Stub!");
    }

    public static Uri withAppendedPath(Uri baseUri, String pathSegment) {
        throw new RuntimeException("Stub!");
    }

    public static final class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder scheme(String scheme) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder opaquePart(String opaquePart) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder encodedOpaquePart(String opaquePart) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder authority(String authority) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder encodedAuthority(String authority) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder path(String path) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder encodedPath(String path) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder appendPath(String newSegment) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder appendEncodedPath(String newSegment) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder query(String query) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder encodedQuery(String query) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder fragment(String fragment) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder encodedFragment(String fragment) {
            throw new RuntimeException("Stub!");
        }

        public Uri.Builder appendQueryParameter(String key, String value) {
            throw new RuntimeException("Stub!");
        }

        public Uri build() {
            throw new RuntimeException("Stub!");
        }

    }
}
