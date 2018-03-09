package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaJokes {

    public String tellAJoke() {
        List<String> jokeList = new ArrayList<>();
        // These are just some random jokes copied from internet, They are not meant
        //to hurt someone's feelings towards any programming language or framework
        jokeList.add("The MS programmers are intrigued and when they get on the train, they watch the Java programmers to see what they do when the guard comes to check the tickets. It turns out that, before the guard comes, they all cram into the toilet. The guard knocks on the door, and asks for the ticket. The guard takes it from under the door, and slides it back.\n" +
                "\n" +
                "The MS programmers are all impressed, so on the way back, they buy only one ticket. Only to watch the Java folks get on the train without buying a ticket at all.\n" +
                "\n" +
                "When they get on the train, the MS people cram into the toilet, as they saw the Java folks on the earlier journey. The Java programmers then knock on the door, and say “Ticket please”. The MS programmers slide the ticket under the door, as they saw the Java programmers do earlier.\n" +
                "\n" +
                "“Thank you”, they say. “You steal our methods, but you don’t understand them.”");
        jokeList.add("A young Java developer and his project manager board a train headed through the mountains on its way to Wichita. They can find no place to sit except for two seats right across the aisle from a young woman and her grandmother. After a while, it is obvious that the young woman and the young programmer are interested in each other, because they are giving each other looks. Soon the train passes into a tunnel and it is pitch black. There is a sound of a kiss followed by the sound of a slap.\n" +
                "When the train emerges from the tunnel, the four sit there without saying a word. The grandmother is thinking to herself, “It was very brash for that young man to kiss my granddaughter, but I’m glad she slapped him.”\n" +
                "\n" +
                "The project manager is sitting there thinking, “I didn’t know the young tech was brave enough to kiss the girl, but I sure wish she hadn’t missed him when she slapped me!”\n" +
                "\n" +
                "The young woman was sitting and thinking, “I’m glad the guy kissed me, but I wish my grandmother had not slapped him!”\n" +
                "\n" +
                "The young programmer sat there with a satisfied smile on his face. He thought to himself, “Life is good. How often does a guy have the chance to kiss a beautiful girl and slap his Ppoject manager all at the same time!”");
        jokeList.add("Two ints and a Float walk into a bar. They spot an attractive Double on her own.\n" +
                "\n" +
                "The first int walks up to her and say: “Hey baby, my VM or yours?”. She slaps him and he walks back dejected.\n" +
                "\n" +
                "The second int walks over. “Hey cute-stuff, can I cook you ‘Beans’ for breakfast?” After a quick slapping, he too walks back.\n" +
                "\n" +
                "Then the Float ambles over casually: “Where those two primitive types bothering you?”, he remarks.\n" +
                "\n" +
                "“Yes, I’m so glad you’re here”, she says. “They just had no Class!”");
        Random random = new Random();
        return jokeList.get(random.nextInt(jokeList.size()));

    }
}
