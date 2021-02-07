package sample;
import javafx.scene.chart.ScatterChart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

Connection link;
      public Connection getConnection() {

          try (Connection conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost/user?autoReconnect=true&useSSL=false", "root", "1234")) {
              if (conn != null) {
                  System.out.println("Connected to the database!");
                  link = DriverManager.getConnection("jdbc:mysql://localhost/user?autoReconnect=true&useSSL=false", "root", "1234");

              } else {
                  System.out.println("Failed to make connection!");
              }

          } catch (SQLException e) {
              System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
          } catch (Exception e) {
              e.printStackTrace();
          }

          return link;
      }
}

