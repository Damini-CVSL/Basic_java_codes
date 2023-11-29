public class ReplaceSubstringInAString{
    public static void main(String[] a){
        String original = "Hello World";
        String substringToReplace = "Hello";
        String replacementString = "Java";

        System.out.println("Original String : " +original);
        System.out.println("Modified String : " +modifiedString(original,substringToReplace,replacementString));
    }

     static String modifiedString(String original, String substring, String replacement){
        if(original.contains(substring)){
            return original.replaceAll(substring,replacement);
        }

        return original;
    }
}