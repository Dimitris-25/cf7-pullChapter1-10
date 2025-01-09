package gr.aueb.cf.ch7;

public class ReplaceDeleteApp {
    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickName;
        String oneName;

        simpleName = firstname.replace("-", " ");
        System.out.println(simpleName);

        nickName = firstname.replace("-", "");
        System.out.println(nickName);

        oneName = firstname.replace("-Helen", "");
        System.out.println(oneName);


    }
}
