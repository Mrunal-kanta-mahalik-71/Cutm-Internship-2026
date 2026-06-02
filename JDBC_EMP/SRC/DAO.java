package JDBC_EMP.SRC;

import java.sql.*;

public class DAO {

    Connection con;

   public DAO() {

    con = DBconnection.getConnection();

    if(con == null) {
        System.out.println("Connection object is NULL");
    }
}

   
    public int insert(Employee e) {

        int row = 0;

        try {

            String sql =
                "INSERT INTO employee VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setDate(3, e.getDob());
            ps.setString(4, e.getDepartment());
            ps.setString(5, e.getPhoneNo());
            ps.setString(6, e.getAccNo());
            ps.setDouble(7, e.getSalary());

            row = ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return row;
    }

   public void getAllEmployees() {

    try {

        String sql = "SELECT * FROM employee";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            System.out.println(
                "ID: " + rs.getInt("id") +
                " | Name: " + rs.getString("name") +
                " | DOB: " + rs.getDate("dob") +
                " | Dept: " + rs.getString("department") +
                " | Phone: " + rs.getString("phone_no") +
                " | AccNo: " + rs.getString("acc_no") +
                " | Salary: " + rs.getDouble("salary")
            );
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

   public void getEmployeeById(int id) {

    try {

        String sql = "SELECT * FROM employee WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println("ID : " + rs.getInt("id"));
            System.out.println("Name : " + rs.getString("name"));
            System.out.println("DOB : " + rs.getDate("dob"));
            System.out.println("Department : " + rs.getString("department"));
            System.out.println("Phone No : " + rs.getString("phone_no"));
            System.out.println("Account No : " + rs.getString("acc_no"));
            System.out.println("Salary : " + rs.getDouble("salary"));

        } else {
            System.out.println("Employee not found");
        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    public int updateSalary(int id, double salary) {

        int row = 0;

        try {

            String sql =
                "UPDATE employee SET salary=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            row = ps.executeUpdate();

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        return row;
    }
    public int deleteEmployee(int id) {

        int row = 0;

        try {

            String sql =
                "DELETE FROM employee WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            row = ps.executeUpdate();

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        return row;
    }
}
