package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        MovieReview mr2 = new MovieReview();

        mr1.title = "인셉션";
        mr1.review = "인생은 무한루프";
        mr2.title = "어바웃";
        mr2.review = "인생은 시간 영화";

        MovieReview[] mrar = new MovieReview[2];
        mrar[0] = mr1;
        mrar[1] = mr2;


        for (int i = 0; i < mrar.length; i++) {
            System.out.println("영화제목 : " + mrar[i].title);
            System.out.println("영화 review : " + mrar[i].review);
        }

        for(MovieReview review : mrar){
            System.out.println("영화제목 : " + review.title);
        }
    }
}
