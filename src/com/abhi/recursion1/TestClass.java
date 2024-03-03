//
//import com.squareup.javapoet.*;
//
//public class CodeGenerator {
//    public static void generateCode(Class<?> modelClass) throws Exception {
//        // Generate Controller
//        TypeSpec controllerType = TypeSpec.classBuilder(modelClass.getSimpleName() + "Controller")
//                .addModifiers(Modifier.PUBLIC)
//                // Add controller code here
//                .build();
//
//        // Generate Service
//        TypeSpec serviceType = TypeSpec.classBuilder(modelClass.getSimpleName() + "Service")
//                .addModifiers(Modifier.PUBLIC)
//                // Add service code here
//                .build();
//
//        // Generate Repository
//        TypeSpec repositoryType = TypeSpec.classBuilder(modelClass.getSimpleName() + "Repository")
//                .addModifiers(Modifier.PUBLIC)
//                // Add repository code here
//                .build();
//
//        // Save the generated code to files
//        JavaFile.builder("your.package.name", controllerType)
//                .build()
//                .writeTo(System.out);
//
//        JavaFile.builder("your.package.name", serviceType)
//                .build()
//                .writeTo(System.out);
//
//        JavaFile.builder("your.package.name", repositoryType)
//                .build()
//                .writeTo(System.out);
//    }
//
//    public static void main(String[] args) throws Exception {
//        // Replace YourModelClass with the actual model class you want to use
//        generateCode(YourModelClass.class);
//    }
//}
