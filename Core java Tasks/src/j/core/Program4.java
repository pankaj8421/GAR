package j.core;
/**
 *
 * @author acer
 */
public class Program4 {
        public static void main(String[] args) {
        try {
            String fileName = "D:\\Employee.java";
            int noOfLines=new FileOperation().getNumberOfLines(fileName);
            System.out.println("Total no of Lines - "+noOfLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
