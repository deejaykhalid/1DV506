package ko222gj_assign4.newagency;

import java.util.ArrayList;

public class NewsAgency {


		 private String name;
		    private ArrayList<Newspaper> newspapers = new ArrayList<>(0);
		    private ArrayList<NewsArticle> newsArticles = new ArrayList<>(0);
		    private NewsArticle newsArticle;


		    NewsAgency(String name) {
		        this.name = name;
		    }

		    void registerNewspaper(Newspaper newspaper) {
		        newspapers.add(newspaper);
		    }

		    private void broadcastNews(NewsArticle newsArticle) {
		        this.newsArticle = newsArticle;
		        for (Newspaper eaNewspaper : newspapers) {
		            if (!eaNewspaper.equals(newsArticle.getOwner())) {
		                eaNewspaper.receiveNewsFromAgency(newsArticle);
		            }
		        }
		    }

		    void collectNews(NewsArticle news) {
		        newsArticles.add(news);
		        broadcastNews(news);
		    }
	
}
