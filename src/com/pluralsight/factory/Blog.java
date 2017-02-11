package com.pluralsight.factory;

public class Blog extends Website {

	// This base class is interested in implementing the createWebsite method.
	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		// etc.. etc...
		// These pages are specific to a Blog website

	}

}
