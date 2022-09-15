package com.fiec.lpiiiback.services;


public class FirebaseInitializer {

    public void initializer(){

        FileInputStream serviceAccount =
                new FileInputStream("./serviceAccount.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);

    }
}
