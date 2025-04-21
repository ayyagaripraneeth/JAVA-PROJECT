import java.util.Scanner;

interface login {
       boolean login(String id, String pass);
}

class Universityportal implements login {
       public boolean login(String id, String pass) {
        if (id.equals("student123") && pass.equals("pass123")) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universityportal u = new Universityportal();

        System.out.print("Enter user id: ");
        String id = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        u.login(id, pass);

        scanner.close();
    }
}
