class printGrade {
    public static void studentGrade(int marks) {
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=70 && marks<90){
            System.out.println("Grade B");
        }
        else if(marks>=50 && marks<70){
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<50){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Fail");
        }

    }
    public static void main(String[] args){
        studentGrade(85);
    }
}
