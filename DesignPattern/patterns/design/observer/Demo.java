package DesignPattern.patterns.design.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber shoaib = new Subscriber("Shoaib");
        Subscriber rehman = new Subscriber("rehman");

        channel.subscriber(shoaib);
        channel.subscriber(rehman);

        channel.newVideoUploaded("RTC working");

        channel.newVideoUploaded("DSAs");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());

            if(c == 1){
                System.out.println("Enter video title ");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            } else if (c == 2) {
                System.out.println("Enter name of subscriber");
                String subsName = br.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.subscriber(subscriber);

            } else if (c == 3) {
                break;
            } else {
                System.out.println("Enter valid option");
                continue;
            }


        }
    }

}
