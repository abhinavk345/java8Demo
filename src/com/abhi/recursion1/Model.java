//import jdk.jfr.DataAmount;
//
//
//public class Model {
//    private String fieldName;
//
//    public String getFieldName() {
//        return fieldName;
//    }
//
//    public void setFieldName(String fieldName) {
//        this.fieldName = fieldName;
//    }
//}
//
//////////////////
//import com.squareup.javapoet.*;
//
//        import javax.lang.model.element.Modifier;
//        import java.io.IOException;
//
//public class CodeGenerator {
//
//    public static void generateCode(String packageName, String className) throws IOException {
//        // Create a Java file builder
//        JavaFile javaFile = JavaFile.builder(packageName,
//                        TypeSpec.classBuilder(className + "Controller")
//                                .addModifiers(Modifier.PUBLIC)
//                                .build())
//                .build();
//
//        // Specify the output directory (you can customize this)
//        javaFile.writeTo(System.out);
//    }
//
//    public static void main(String[] args) {
//        try {
//            // Pass your model class details for code generation
//            generateCode("com.example", "ModelClass");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}