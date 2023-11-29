public class RemoveSubstringFromString{
    public static void main(String[] a){
        String original = "This is the String code";
        String removalsubstring = "the";

        System.out.println("Original String : " +original);
        System.out.println("Modifies String is : " +modifiedString(original,removalsubstring));
    }

    static String modifiedString(String original, String removeVariable){

        String[] subStrings = original.split(" ");

        for(String i : subStrings){
            if(i.equals(removeVariable))
                return original.replaceAll(removeVariable,"");
        }
        return original; 
    }
}