class User {
    String name = "Guest User";
}

class AdminUser extends User {   // AdminUser IS-A User
    void deleteAccount() {
        System.out.println("Admin deleted an account");
    }
}

public class IsARelationExample {
    public static void main(String[] args) {
        AdminUser admin = new AdminUser();
        System.out.println("Logged in as: " + admin.name);
        admin.deleteAccount();
    }
}
