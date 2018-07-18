
public class NewsChannel implements Channel{

	private String news;
	
	
	@Override
	public void update(Object news) {
		this.setNews((String) news);
	}
	private void setNews(String news) {
		this.news = news;
		
	}
	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();
		
		observable.addObserver(observer);
		observable.setNews("news");
		//assertEquals(observer.getNews(), "news");
	}

}
