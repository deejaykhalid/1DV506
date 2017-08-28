package ko222gj_assign4.newagency;

import java.util.ArrayList;

public class Newspaper {
	 private String name;
	    private ArrayList<NewsArticle> articles = new ArrayList<>();

	    Newspaper(String name) {
	        this.name = name;
	    }

	    String getName() {
	        return name;
	    }

	    void addToArticlesUponCreation(NewsArticle newsArticle) {
	        articles.add(newsArticle);
	    }

	    void sendAllNewsToAgency(NewsAgency agency) {
	        for (NewsArticle eaNews : articles) {
	            agency.collectNews(eaNews);
	        }
	    }

	    void sendNewsArticleToAgency(NewsAgency agency, NewsArticle newsArticle) {
	        agency.collectNews(newsArticle);
	    }

	    void receiveNewsFromAgency(NewsArticle newsArticle) {
	        articles.add(newsArticle);
	    }

	    void printArticles() {
	        System.out.println("\n***Articles from: " + this.name + "***");
	        for (NewsArticle eaNews : articles) {
	            System.out.println(eaNews.getHeadline());
	        }
	    }
	}

