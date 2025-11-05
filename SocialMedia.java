class SocialMediaPost {
    String username = "user123";

    void like() {
        System.out.println("Post liked!");
    }
}

class InstagramReel extends SocialMediaPost { // Reel IS-A Post
    int duration = 30;
}

public class SocialMedia {
    public static void main(String[] args) {
        InstagramReel reel = new InstagramReel();
        System.out.println("Posted by: " + reel.username);
        reel.like();
        System.out.println("Reel duration: " + reel.duration + " seconds");
    }
}
