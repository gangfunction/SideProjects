package dao.reviewPage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class reviewMain {

    private Set<String> reviewers = new HashSet<>();
    private Set <String> reviews = new HashSet<>();

    private void loadReviews() throws IOException {

    }


    public static void main() throws SQLException, ClassNotFoundException {
        new reviewMenu();
    }
}
