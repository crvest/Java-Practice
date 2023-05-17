import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        // create hashmap object
        HashMap<String, String> trackList = new HashMap<String, String>();
        // populate hashmap
        trackList.put("One", "This is track one");
        trackList.put("Two", "This is track two");
        trackList.put("Three", "This is track three");
        trackList.put("Four", "This is track four");
        // pull out lyrics for track named "One"
        System.out.println(trackList.get("One"));
        
        // print out all track names and lyrics
        for(String key : trackList.keySet()){
            System.out.println(key + " : " + trackList.get(key));
        }
}
}
