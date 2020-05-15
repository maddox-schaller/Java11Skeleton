import java.text.DecimalFormat;

public class FormattingAndNumericOutput {
    public static void main(String[] args) {
        //easier to read format
        //new string pattern
        String pattern1 = "###,###.###";
        //initialize new decimal format
        DecimalFormat df1 = new DecimalFormat(pattern1);
        //output the formatted number
        System.out.println(df1.format(123456789.123456789));
        
        //list of numbers
        
        String pattern2 = "#,#,#,#.#";
        DecimalFormat df2 = new DecimalFormat(pattern2);
        System.out.println(df2.format(123456789.123456789));
        
        //leading zeros
        
        String pattern3 = "000.###";
        DecimalFormat df3 = new DecimalFormat(pattern3);
        System.out.println(df3.format(1.123456789));
        
        //money format
        
        String pattern4 = "¤,###.##";
        DecimalFormat df4 = new DecimalFormat(pattern4);
        System.out.println(df4.format(123456789.123456789));
        
        //percentage format
        
        String pattern5 = "#%";
        DecimalFormat df5 = new DecimalFormat(pattern5);
        System.out.println(df5.format(.1285778341325));
    }
}