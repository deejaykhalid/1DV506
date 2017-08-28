package ko222gj_assign4.newagency;

public class NewsArticle {

		 private String owner;
		    private String headline;
		    private Newspaper newspaper;

		    NewsArticle(Newspaper owner, String headline) {
		        newspaper = owner;
		        this.owner = owner.getName();
		        this.headline = headline;
		        owner.addToArticlesUponCreation(this);
		    }

		    

			Newspaper getOwner() {
		        return newspaper;
		    }

		    String getHeadline() {
		        return headline;
		    }
		
	}


