package fan.study.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class RequestHeaderUtil {

	public static List<String> getRequestHeader(List<String> builder) {
		
		return builder;
	}
	
	static class RequestHeadersBuilder {
		
		List<String> lst = new ArrayList<String>();
		
		public RequestHeadersBuilder setRequestHeader1() {
			lst.add("RequetsHeader1");
			return this;
		}
		
		public RequestHeadersBuilder setRequestHeader2() {
			lst.add("RequetsHeader2");
			return this;
		}
		
		public RequestHeadersBuilder setRequestHeaderOther(String requestHeader) {
			lst.add(requestHeader);
			return this;
		}

		public List<String> build() {
			return lst;
		}
	}
	
}
