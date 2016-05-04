package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBlQ1dxOsFmDmpq25A3IRB_8k0J5vSnrtA";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bGUhjiWFlU9ilGHWCA6qc-0ruKiqEHD-4pKocp8yc9AXy-Tz2e6X2WOj2wKwIv-8I9gx7NSMmKJptwbtkOCsPA7gpd2mjOkQ4JFpaWSjnATMNwxjo38OTwetTYz0ZzAOGkzFTv4");

        c.createData("YOOOOOOOOOOOOOOOOO!!", "Test message");

        return c;
    }
}

