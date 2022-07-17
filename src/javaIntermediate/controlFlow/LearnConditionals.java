package javaIntermediate.controlFlow;

public class LearnConditionals {
    public static void main(String[] args) {
//        int x= 10;
//        int y= 20;
//        System.out.println(doSubstraction(x, y));

//        int studentExam1 = 87;
//        int studentExam2 = 64;
//        int studentExam3 = 96;
//        int studentExam4 = 42;
//        int studentExam5 = 78;
//        LearnConditionals student = new LearnConditionals();
//        System.out.println(student.getLetterGrade(studentExam1));
//        System.out.println(student.getLetterGrade(studentExam2));
//        System.out.println(student.getLetterGrade(studentExam3));
//        System.out.println(student.getLetterGrade(studentExam4));
//        System.out.println(student.getLetterGrade(studentExam5));

        LearnConditionals month = new LearnConditionals();
        int monthNum = 13;
        System.out.println(month.getNameOfMonth(monthNum));
    }

//   static int doSubstraction (int num1, int num2){
//        if (num1 >= num2) {
//            return num1 - num2;
//        }else if (num2 >= num1){
//            return num2 - num1;
//        } else
//            return -1;
//    }

//    public String getLetterGrade(int grade){
//        String letterGrade = "";
//        if (grade < 65) {
//            letterGrade = "F";
//        } else if (grade < 75) {
//            letterGrade = "D";
//        } else if (grade < 80) {
//            letterGrade = "C";
//        } else if (grade < 90) {
//            letterGrade = "B";
//        } else {
//            letterGrade = "A";
//        }
//        return letterGrade;
//    }

    //Switch Case Statements
    public String getNameOfMonth (int monthNum){
        String month = "";
//        if (monthNum < 1 || monthNum > 12) {
//            return "ERROR";
//        }
        switch (monthNum){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                return "ERROR";
        }
        return month;
    }
}
