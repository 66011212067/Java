import java.util.Scanner;
public class Week8_66011212067 {
    public static void main(String[] args){
        // set Scanner varible
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_float = new Scanner(System.in);
        // input count Student --> n
        System.out.print("input count Student: ");
        int n = sc_int.nextInt();
        // create varible array names,mid,final,scores,grades
        String []names = new String[n];
        float []midterm = new float[n];
        float []finals = new float[n];
        float []scores = new float[n];
        String []grades = new String[n];
        // loop n, input name,mid,final
        for(int i=0;i<n;i++){
            System.out.println("***************************************");
            System.out.print("name: ");
            names[i] = sc_str.nextLine();
            System.out.print("midterm: ");
            midterm[i] = sc_float.nextFloat();
            System.out.print("final: ");
            finals[i] = sc_float.nextFloat();
            // calculator scores,grades
            scores[i] = midterm[i]+finals[i];
            grades[i] = (scores[i]>=70)?"S":"U";
        }
        System.out.println("***************************************");
        // print header
        System.out.printf("Name\t\tMidterm\tFinal\tScore\tGrade\n");
        String [][]result_str = {{"","","Max midterm","Min midterm"},{"","","Max Final","Min Final"},{"","","Max score","Min score"}};
        float [][]result_int = {{0,0},{0,0},{0,0}};
        // loop n, print name,mid,final,score,grade
        for(int index=0;index<n;index++){
            System.out.printf("%s\t\t%.2f\t%.2f\t%.2f\t%s\n",names[index],midterm[index],finals[index],scores[index],grades[index]);
            // 
            float m_number = finals[index];
            int a_index = 0;
            if(result_int[a_index][1]<=0){
                result_int[a_index][1] = m_number;
                result_str[a_index][1] = names[index];
            }
            if(m_number>result_int[0][0]){
                result_int[0][0] = m_number;
                result_str[0][0] = names[index];
            }else{
                result_int[a_index][1] = m_number;
                result_str[a_index][1] = names[index];
            }
            // 
            float f_number = finals[index];
            a_index = 1;
            if(result_int[a_index][1]<=0){
                result_int[a_index][1] = f_number;
                result_str[a_index][1] = names[index];
            }
            if(f_number>result_int[1][0]){
                result_int[1][0] = f_number;
                result_str[1][0] = names[index];
            }else{
                result_int[a_index][1] = f_number;
                result_str[a_index][1] = names[index];
            }
            // 
            float s_number = scores[index];
            a_index = 2;
            if(result_int[a_index][1]<=0){
                result_int[a_index][1] = s_number;
                result_str[a_index][1] = names[index];
            }
            if(s_number>result_int[2][0]){
                result_int[2][0] = s_number;
                result_str[2][0] = names[index];
            }else{
                result_int[a_index][1] = s_number;
                result_str[a_index][1] = names[index];
            }
        }
        // footer
        for(int i=0;i<3;i++){
            System.out.printf("%s\t%s\n",result_str[i][2],result_str[i][0]);
            System.out.printf("%s\t%s\n",result_str[i][3],result_str[i][1]);
        }
    }
}
