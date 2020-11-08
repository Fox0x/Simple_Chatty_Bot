class Book {

	String[] authors;
	String title;
	int yearOfPublishing;

	public Book(String title, int yearOfPublishing, String[] authors) {
		this.title = title;
		this.yearOfPublishing = yearOfPublishing;
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=[" + String.join(",", authors) + "]";
	}
}