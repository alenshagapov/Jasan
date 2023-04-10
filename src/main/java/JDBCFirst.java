import java.sql.*;

public class JDBCFirst {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/jasan";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "alen12345";
    private static final String SQL_GET_ALL_USERS = "select * from users";
    private static final String SQL_INTO_USERS = "insert into users (name,surname,age) values ('Vladimir','Putin',55)";
    private static final String SQL_UPDATE_USERS = "update users set name = 'Barak', surname = 'Obama' where id = 6";
    private static final String SQL_DELETE_USERS = "delete from users where id = 6";

    public static void main(String[] args) {


        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            if (connection != null){
                Statement statement = connection.createStatement();
                statement.executeUpdate(SQL_DELETE_USERS);
                ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_USERS);
                while (resultSet.next()){
                    System.out.print(resultSet.getString("id") + " ");
                    System.out.print(resultSet.getString("name")  + " ");
                    System.out.print(resultSet.getString("surname") + "\n");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
