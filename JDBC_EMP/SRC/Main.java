package JDBC_EMP.SRC;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DAO dbemp = new DAO();

        while(true) {

            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All");
            System.out.println("3. Search By ID");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Choice : ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {

                case 1:

                    Employee e1 = new Employee();

                    System.out.print("Enter ID: ");
                    e1.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    e1.setName(sc.nextLine());

                    
                    try {
                        System.out.print("Enter DOB (dd/MM/yyyy): ");
                        String dobInput = sc.nextLine();

                        SimpleDateFormat sdf =
                                new SimpleDateFormat("dd/MM/yyyy");

                        Date utilDate = sdf.parse(dobInput);

                        java.sql.Date sqlDate =
                                new java.sql.Date(utilDate.getTime());

                        e1.setDob(sqlDate);

                    } catch (Exception ex) {
                        System.out.println("Invalid DOB format!");
                        break;
                    }

                    System.out.print("Enter Department: ");
                    e1.setDepartment(sc.nextLine());

                    System.out.print("Enter Phone: ");
                    e1.setPhoneNo(sc.nextLine());

                    System.out.print("Enter Account No: ");
                    e1.setAccNo(sc.nextLine());

                    System.out.print("Enter Salary: ");
                    e1.setSalary(sc.nextDouble());

                    int row = dbemp.insert(e1);

                    if(row > 0)
                        System.out.println("Inserted Successfully");
                    else
                        System.out.println("Insertion Failed");

                    break;

                case 2:
                    dbemp.getAllEmployees();
                    break;

                case 3:

                    System.out.print("Enter ID : ");
                    int sid = sc.nextInt();

                    dbemp.getEmployeeById(sid);
                    break;

                case 4:

                    System.out.print("Enter ID : ");
                    int uid = sc.nextInt();

                    System.out.print("Enter New Salary : ");
                    double sal = sc.nextDouble();

                    dbemp.updateSalary(uid, sal);

                    System.out.println("Updated");
                    break;

                case 5:

                    System.out.print("Enter ID : ");
                    int did = sc.nextInt();

                    dbemp.deleteEmployee(did);

                    System.out.println("Deleted");
                    break;

                case 6:

                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}