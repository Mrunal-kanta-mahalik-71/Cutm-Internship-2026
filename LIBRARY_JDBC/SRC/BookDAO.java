package LIBRARY_JDBC.SRC;

import java.sql.*;

public class BookDAO {

    // INSERT
    public int addBook(Book book) {

        int rows = 0;

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO library VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, book.getId());
            ps.setString(2, book.getName());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getPublisher());
            ps.setString(5, book.getLanguage());

            rows = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    // DISPLAY ALL
    public void displayBooks() {

        try {

            Connection con =
                    DBConnection.getConnection();

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM library");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("publisher") + " | " +
                        rs.getString("language")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // GET BY ID
    public void getById(int id) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM library WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                System.out.println("ID : "
                        + rs.getInt("id"));

                System.out.println("Name : "
                        + rs.getString("name"));

                System.out.println("Author : "
                        + rs.getString("author"));

                System.out.println("Publisher : "
                        + rs.getString("publisher"));

                System.out.println("Language : "
                        + rs.getString("language"));

            } else {

                System.out.println("Book Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public int updateBook(Book book) {

        int rows = 0;

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "UPDATE library SET name=?, author=?, publisher=?, language=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, book.getName());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getPublisher());
            ps.setString(4, book.getLanguage());
            ps.setInt(5, book.getId());

            rows = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    // DELETE
    public boolean deleteBook(int id) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "DELETE FROM library WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}