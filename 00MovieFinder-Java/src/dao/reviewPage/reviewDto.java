package dao.reviewPage;

public class reviewDto {
    private static String title="not yet";
    private static String content="not yet";

    public static String getTitle() {
        return title;
    }
    public static void setTitle(String title) {
        reviewDto.title = title;
    }
    public static String getContent() {
        return content;
    }
    public static void setContent(String content) {
        reviewDto.content = content;
    }

}
