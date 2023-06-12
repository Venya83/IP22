package dontpon;

public class UserLocal {
    private String login;
    private String password;

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("User with login " + login + " and password " + password + " sent a query.");
            }
        }
        
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        // Создание экземпляра класса User и вызов метода createQuery()
        UserLocal user = new UserLocal();
        user.login = "user123";
        user.password = "pass123";
        user.createQuery();
    }
}
