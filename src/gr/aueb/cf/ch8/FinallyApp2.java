package gr.aueb.cf.ch8;

public class FinallyApp2 {
    public static void main(String[] args) throws Exception{
        int num = 12;
        try {
            if (num == 12) throw new Exception();
        }catch (Exception e) {
            return;
        }finally {
            System.out.println("Coding factory is always executed!");
        }
        System.out.println("This piece of code is not always executed");
    }
}
