public class Question5 {
    public static class NewsStory {
        String author;
        String newsOutlet;
        String subject;
        int wordCount;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getNewsOutlet() {
            return newsOutlet;
        }

        public void setNewsOutlet(String newsOutlet) {
            this.newsOutlet = newsOutlet;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getWordCount() {
            return wordCount;
        }

        public void setWordCount(int wordCount) {
            this.wordCount = wordCount;
        }

        public NewsStory(String author, String newsOutlet, String subject, int wordCount) {
            this.author = author;
            this.newsOutlet = newsOutlet;
            this.subject = subject;
            this.wordCount = wordCount;
        }

        public NewsStory() {
        }
    }

    public static void main(String[] args) {
        String author = Utils.getInput("What is the name of the author?");
        String newsOutlet = Utils.getInput("What is the name of the news outlet?");
        String subject = Utils.getInput("What is the subject of the article?");
        int wordCount = Utils.getNumber("What is the word count of the article?");
        NewsStory breakingNews = new NewsStory(author, newsOutlet, subject, wordCount);
        System.out.println("The article was written by " + breakingNews.author + " for " + breakingNews.newsOutlet + ". It covers " + breakingNews.subject + ", and has a word count of " + breakingNews.wordCount);
    }
}
