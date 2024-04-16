package DesignPattern.patterns.design.builder;

class User {
     private final String userId;
     private final String userName;
     private final String emailId;
     private final  String currentCity;

     private User(UserBuilder builder){
         // initialize
         this.userId = builder.userId;
         this.userName = builder.userName;
         this.emailId = builder.emailId;
         this.currentCity = builder.currentCity;

     }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", currentCity='" + currentCity + '\'' +
                '}';
    }

    // inner class to create object
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;
        private String currentCity;


        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setCurrentCity(String currentCity) {
            this.currentCity = currentCity;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}

