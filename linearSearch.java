package courses;

public class linearSearch{
    public static boolean spellcheck(String word, String[] words){
        boolean found = false;

        for( int index = 0; index < words.length ; index++){
            if ( word.equals(words[index])){
            found = true;
            break;
            }
        
            
        }
        return found;

}
    
    public static void main(String[] args) {
        String[] words = {"of", "the", "when", "why"};
        String word = "is";
        boolean wordfound =  spellcheck(word, words);
        System.out.println("Word has been found: " + wordfound );
        
    }
}