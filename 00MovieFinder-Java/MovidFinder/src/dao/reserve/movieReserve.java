package dao.reserve;

import dto.movieDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class movieReserve {
    public movieReserve() {
        try {
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement("insert into reservation(movie_name) select movie_name from movie where num =?");
            stmt.setInt(1, movieDTO.getPointer());
            stmt.executeUpdate();
            stmt = conn.prepareStatement("select movie_name from reservation where num=?");
            stmt.setInt(1, movieDTO.getPointer());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                movieDTO.setMovieName(rs.getString("movie_name"));
                }
            new audienceForMovie();
            movieDTO.setAudience();
            stmt = conn.prepareStatement("update movie set audience = ? where num = ?");
            stmt.setInt(1, movieDTO.getAudience());
            stmt.setInt(2, movieDTO.getPointer());
            new movieForAudience();
            stmt.executeUpdate();
            stmt = conn.prepareStatement("select * from box_office where movie_name='" + movieDTO.getMovieName() + "'");
            rs = stmt.executeQuery();
            System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
            if (rs.next())
                {
                    String movie_name = rs.getString("movie_name");
                    String year = rs.getString("years");
                    String ranks = rs.getString("ranks");
                    String genre = rs.getString("genre");
                    String director = rs.getString("director");
                    System.out.println("----------------------------------------------------");
                    System.out.println("영화이름: " + movie_name + "\n" + "년도: " + year + "\n" + "순위: " + ranks + "\n" + "장르: " + genre + "\n" + "감독: " + director + "\n");
                    System.out.println("----------------------------------------------------");
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
