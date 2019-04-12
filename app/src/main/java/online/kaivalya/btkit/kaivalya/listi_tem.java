package online.kaivalya.btkit.kaivalya;

/**
 * Created by abhishek on 7/4/2018.
 */

public class listi_tem {
    String name;
    String code;
    String designation;
    String phone;
    String trainee;


    public listi_tem(String name, String code, String designation, String phone,String trainee) {
        this.name = name;
        this.code = code;
        this.designation = designation;

        this.phone = phone;
        this.trainee = trainee;
    }

    public String getName() {
        return name;
    }

    public String getCode() {

        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPhone() {
        return phone;
    }

    public String getTrainee() {
        return trainee;
    }
}

