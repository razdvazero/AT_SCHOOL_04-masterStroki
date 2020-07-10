import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;
import somethinggreen.Contract;

public class Main {
    public static void main(String[] args) {
        Other.saySomthing();
        Some test = new Some("раздва");
        System.out.println(test);
        //System.out.println(test.getSecret(true));
        //System.out.println(test.getNoMoreSecrets());
        test.soTellMeAboutInterfaces();

        AnnotationForExaple test2 = Some.class.getAnnotation(AnnotationForExaple.class);
        System.out.println(test2.description());
    }
}
