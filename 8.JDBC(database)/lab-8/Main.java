import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            System.out.println("Press 1 to see the database\n");
            System.out.println("Press 2 to modify database\n");
            System.out.println("Press 0 to exit\n");
            int choose = input.nextInt();
            if (choose == 1) {
                try (


                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/IUT_BMI?autoReconnect=true&useSSL=false", "root", "1234");
                        Statement stmt = conn.createStatement();
                ) {
                    String strSelect = "select employeeID, employeeName,employeeHeight,employeeWeight from Employee_BMI";
                    System.out.println("The SQL query is: " + strSelect);
                    System.out.println();

                    ResultSet rset = stmt.executeQuery(strSelect);


                    System.out.println("The records selected are:");
                    int rowCount = 0;
                    while (rset.next()) {
                        String Ename = rset.getString("employeeName");
                        int Eid = rset.getInt("employeeID");
                        int EHeight = rset.getInt("employeeHeight");
                        int EWeight = rset.getInt("employeeWeight");
                        float bmi = EWeight / (EHeight * EHeight / 10000);
                        System.out.println(Eid + " " + Ename + " " + EHeight + " " + EWeight + " " + "BMI: " + bmi);
                        ++rowCount;
                    }
                    System.out.println("Total number of records = " + rowCount);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
            else if (choose == 2) {
                System.out.println("1 to add\n");
                System.out.println("2 to delate\n");
                int choice;
                choice = input.nextInt();
                if (choice == 1) {


                    try (
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/IUT_BMI?autoReconnect=true&useSSL=false", "root", "1234");
                            Statement stmt = conn.createStatement();
                    ) {
                        int id, weight, height, bmi;
                        String name;
                        System.out.println("Input ID:");
                        id = input.nextInt();
                        System.out.println("Input height:");
                        height = input.nextInt();
                        System.out.println("Input weight:");
                        weight = input.nextInt();
                        System.out.println("Input Name:");
                        name = input.next();
                        bmi = weight / (height * height / 10000);
                        String strSelect = "insert into Employee_BMI values(" + id + "," + " '" + name + "' " + "," + height + "," + weight + "," + " '" + bmi + " ')";
                        System.out.println("The SQL query is: " + strSelect);
                        System.out.println();
                        int count = stmt.executeUpdate(strSelect);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
                else if (choice==2) {

                    try (
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/IUT_BMI?autoReconnect=true&useSSL=false", "root", "1234");
                            Statement stmt = conn.createStatement();
                    ) {
                        int id, weight, height, bmi;
                        String name;
                        System.out.println("Input employee's name that you want to delate:");
                        id = input.nextInt();
                        String strSelect = "delete from  Employee_BMI  where employeeID ="+ id;
                        System.out.println("The SQL query is: " + strSelect);
                        System.out.println();
                        int count = stmt.executeUpdate(strSelect);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
                else System.out.println("Please insert the correct numb!\n");
                }
            else if(choose==3){
                i=0;
            }
            else System.out.println("Please insert the correct numb!\n");
                }
            }
        }
/*Fayyoz Naimov
* u1910071*/