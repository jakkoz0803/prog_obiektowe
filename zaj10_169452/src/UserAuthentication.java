class UserAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password) {
        if(username.equals("joejqd") && password.equals("silnehaslo4")) {
            return true;
        }
        return false;
    }
    @Override
    public void logout() {
        System.out.println("wylogowano");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(username.equals("joejqd") && oldPassword.equals("silnehaslo4")) {
            return true;
        }
        return false;
    }
}
