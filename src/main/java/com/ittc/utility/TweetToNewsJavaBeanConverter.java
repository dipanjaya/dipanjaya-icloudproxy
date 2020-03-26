package com.ittc.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.stereotype.Component;

import com.ittc.javabeans.NewsJavaBean;

/* Used for binding the incoming tweets information to beans and returns an set of objects */

@Component
public class TweetToNewsJavaBeanConverter {

	@Autowired
	private URLIdentifier finder;

	public Set<NewsJavaBean> getAllNewsJavaBeans(List<Tweet> tweets) {

		Set<NewsJavaBean> newsBeans = null;

		newsBeans = new LinkedHashSet<>(100);

		if (tweets.isEmpty() == false) {
			for (Tweet tweet : tweets) {

				/* Converting the server time to Indian standard time */
				DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); 

				newsBeans.add(new NewsJavaBean(formatter.format(tweet.getCreatedAt()), tweet.getUnmodifiedText(),
						tweet.getProfileImageUrl(), finder.extractURL(tweet.getUnmodifiedText()), tweet.getFromUser()));
			}
		}

		return newsBeans;
	}

}
