public class AuthenticationTest {
    public static void main(String[] args) {
        UserAuthentication joe = new UserAuthentication();
        boolean czyZalogowano = joe.login("joejqd","silnehaslo4");
        System.out.println(czyZalogowano);

        AdminAuthentication admin = new AdminAuthentication();
        boolean czyAdminZalogowany = admin.login("joejqd","silnehaslo4");
        System.out.println(czyAdminZalogowany);
        admin.resetPassword("joejqd","silnehaslo4","admin");
        admin.logout();
    }
}
