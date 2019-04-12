package online.kaivalya.btkit.kaivalya;

/**
 * Created by abhishek on 7/4/2018.
 */

public class listi_tem1 {
    String name;
    String code;
    String designation;
    String phone;
    String trainee;
    String dates;
    String category;
    //String contents;


    public String getDates() {
        return dates;
    }

    public String getCategory() {
        return category;
    }

   /* public String getContents() {
        return contents;
    }
*/
    public listi_tem1(String name, String code, String designation, String phone, String trainee, String dates, String category) {
        this.name = name;
        this.code = code;
        this.designation = designation;

        this.phone = phone;
        this.trainee = trainee;
        this.dates = dates;

        this.category = category;
        //this.contents = contents;
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

