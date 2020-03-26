package com.ittc.utility;

import org.springframework.stereotype.Component;

/* Utility class for identifying the URL from unmodified text from twitter end-point */

@Component
public class URLIdentifier {

	public String extractURL(String literal) {

		String[] in = literal.split(" ");

		for (int i = 0; i < in.length; i++) {
			if (in[i].startsWith("https://")) {
				return in[i];
			}
		}

		return "https://twitter.com/home";
	}

}
