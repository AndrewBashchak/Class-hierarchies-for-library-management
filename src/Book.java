import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private Author author;
    private int publicationYear;
    private List<Rating> reviews;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Rating review) {
        reviews.add(review);
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Rating r : reviews) {
            sum += r.getRating();
        }
        return sum / reviews.size();
    }

    public String getInfo() {
        String ratingInfo = reviews.isEmpty()
                ? "No ratings yet"
                : String.format("%.1f/5", getAverageRating());
        return "Title: " + title +
                ", " + author.getInfo() +
                ", Year of publication: " + publicationYear
                + ", Rating: " + ratingInfo;
    }
}
