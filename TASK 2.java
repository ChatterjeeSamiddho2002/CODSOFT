//TASK 2 STUDENT GRADE CALCULATOR FOR CODSOFT JAVA PROGRAMMER
import java.util.*;
 class main{
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
          int n=S.nextInt(); // Taking input for courses
        System.out.println("Enter number of courses:" + n);
        
      double[] marks= new double[n];//Array approach for inputting marks
      
      for (int i=0;i<n;i++){
          marks[i]=S.nextInt();
      }
      double CGPA=0;
      double sum=0;
      double grade[]=new double[n];
      for (int i=0;i<n;i++){
          grade[i]=(marks[i]/10);// (marks/10)
      }
        for (int i=0;i<n;i++){
            sum+=marks[i];//the variable sum gets increased for every value stored in marks array
    }
    CGPA=sum/(n*10);// Divided by 10 as CGPA cannot exceed 10
    System.out.println("Total sum:"+ sum);
    System.out.println("CGPA:"+ CGPA);
    System.out.println("Percentage Marks:"+ (CGPA*9.50));
    if (CGPA>=9.00){
        System.out.println("Grade: A+");
    }
    if (CGPA<9.00 && CGPA>= 8.00){
        System.out.println("Grade: A");
            }
    if (CGPA<8.00 && CGPA>=7.00){
        System.out.println("Grade: B");
    }
    if (CGPA<7.00 && CGPA>=6.00){
        System.out.println("Grade: C");
    }
    if (CGPA<6.00){
        System.out.println("Grade: D");
    }
}
}

