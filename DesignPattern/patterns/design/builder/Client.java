package DesignPattern.patterns.design.builder;

public class Client {

    public static void main(String[] args) {
        User shoaibUser = (User) new User.UserBuilder()
                .setUserId("201")
                .setUserName("shoaib-code")
                .setEmailId("shoaibrahman999@gmail.com")
                .setCurrentCity("Delhi").build();

        System.out.println(shoaibUser.toString());

        User goblinUser = User.UserBuilder.builder()
                .setUserId("202")
                .setUserName("goblin-code")
                .setEmailId("goblin@gmail.com")
                .setCurrentCity("Gurgaon").build();

        System.out.println(goblinUser.toString());
    }
}
