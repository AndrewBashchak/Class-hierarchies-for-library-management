public class Rating {

    private int rating;

    public Rating(int rating) {
        if (rating < 1) {
            this.rating = 1;
        } else {
            this.rating = Math.min(rating, 5);
        }
    }

    public int getRating() {
        return rating;
    }
}
