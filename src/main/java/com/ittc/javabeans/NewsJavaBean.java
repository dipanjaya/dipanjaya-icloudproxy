package com.ittc.javabeans;

/* Java Bean object to bind in HTTP request scope */

public class NewsJavaBean {

	private String createdDate;
	private String text;
	private String image;
	private String url;
	private String fromUser;

	public NewsJavaBean() {
	}

	public NewsJavaBean(String createdDate, String text, String image, String url, String fromUser) {
		this.createdDate = createdDate;
		this.text = text;
		this.image = image;
		this.url = url;
		this.fromUser = fromUser;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFromUser() {
		return fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	@Override
	public String toString() {
		return "NewsJavaBeans [createdDate=" + createdDate + ", text=" + text + ", image=" + image + ", url=" + url
				+ ", fromUser=" + fromUser + "]";
	}

}
