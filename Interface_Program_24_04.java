package weekelyAssignment1;



interface Camera {
 void takePhoto();
}

interface MusicPlayer {
 void playMusic();
}

interface SmartFeatures {
 void connectToWifi();
}


class SmartPhone implements Camera, MusicPlayer, SmartFeatures {

 @Override
 public void takePhoto() {
     System.out.println("Photo captured successfully");
 }

 @Override
 public void playMusic() {
     System.out.println("Playing music...");
 }

 @Override
 public void connectToWifi() {
     System.out.println("Connected to WiFi");
 }
}


public class Interface_Program_24_04 {
 public static void main(String[] args) {
   
     SmartPhone myPhone = new SmartPhone();
     myPhone.takePhoto();
     myPhone.playMusic();
     myPhone.connectToWifi();
 }
}