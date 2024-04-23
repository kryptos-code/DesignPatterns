package DesignPattern.patterns.design.iterator;

public class Main {

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Shoaib","2"));
        userManagement.addUser(new User("Arham","4"));
        userManagement.addUser(new User("Zeeshan","6"));
        userManagement.addUser(new User("Muneer","8"));

        MyIterator myIterator = userManagement.getIterator();

        while(myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }
    }
}
