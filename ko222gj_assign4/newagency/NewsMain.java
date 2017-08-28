package ko222gj_assign4.newagency;

public class NewsMain {

	public static void main(String args[]) {

		   Newspaper Aftonbladet = new Newspaper("The Aftonbladet");
		   Newspaper metro = new Newspaper("The Metro");
	       Newspaper dailynews = new Newspaper("The Daily News");
		        Newspaper losangelestime = new Newspaper("Los Angeles Times");

		        Newspaper[] newspapers = {Aftonbladet, dailynews, metro, losangelestime};

		        NewsAgency reuters = new NewsAgency("Reuters");

		        for (Newspaper eaNewspaper : newspapers) {
		            reuters.registerNewspaper(eaNewspaper);
		        }

		        NewsArticle newArticle = new NewsArticle(Aftonbladet, "Florida airport shooting suspect will face charges that could bring the death penalty");
		        NewsArticle neArticle = new NewsArticle(metro, " How to quit a job you hate with grace ");
		        NewsArticle ctArticle = new NewsArticle(losangelestime, "Has Hollywood lost touch with America?");

		        Aftonbladet.sendAllNewsToAgency(reuters);

		        metro.sendNewsArticleToAgency(reuters, newArticle);

		        for (Newspaper eaNewspaper : newspapers) {
		            eaNewspaper.printArticles();
		        }
		    }
		

	}


