package day36_CustomClass;

public class Offer {

    public String location, jobTitle, companyName;
    public double salary;
    public boolean hasBenefit, isWFH, hasPTO, isFulltime;

    public void setInfo(String location, String jobTitle, String companyName, double salary, boolean hasBenefit, boolean isWFH, boolean hasPTO, boolean isFulltime) {
        this.location = location;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFulltime = isFulltime;
    }

    public void getInfo(){
        System.out.println("Company: " + companyName+ "\nLocation: " + location + "\nSalary: $" + salary +
                "\nJob Title: " + jobTitle + "\nHas Benefit: " + hasBenefit + "\nWork From Home: " + isWFH +
                "\nHas PTO: " + hasPTO + "\nis Full time: " + isFulltime);
        System.out.println("===========================================");
    }

}
