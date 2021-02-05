package day41_Encapsulation;

public class Credentials {

    private String userName = "cybertek";
    private double passWord = 1234;

    public String getUserName(){
        return  userName;
    }

    public double getPassWord(){
        return passWord;
    }

    public void setUserName(String userName){
       /* if(userName.length() < 8){
            return;
        }*/
        this.userName = userName;
    }

    public void setPassWord(double passWord){
        this.passWord = passWord;
    }

}
