
@ClassInfo(author = "Tisho", revision = 3, checked = false)

public class AnnotationClass {

    public static void main(String[] args) {

        Class aClass = AnnotationClass.class;
        java.lang.annotation.Annotation[] annotations = aClass.getAnnotations();

        for (java.lang.annotation.Annotation annotation : annotations) {
            if (annotation instanceof ClassInfo) {
                ClassInfo myAnnotation = (ClassInfo) annotation;
                System.out.println("author: " + myAnnotation.author());
                System.out.println("revision: " + myAnnotation.revision());
            }
        }

    }

}
