package com.pda.mobile.kafka.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.pda.mobile.MobileApplication;

@Configuration
public class FirebaseConfig {

	@Autowired
	ResourceLoader resourceLoader;
	
	private static final Logger log = Logger.getLogger(FirebaseConfig.class.getName());
	 @Bean
	 FirebaseMessaging firebaseMessaging() throws IOException 
	 {
		 	Resource resource = resourceLoader.getResource("classpath:serviceAccountKey.json");

		    InputStream input = resource.getInputStream();
		 
		    //InputStream is = new ClassPathResource("classpath:serviceAccountKey.json").getInputStream();

			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(input)).build();

			FirebaseApp app = FirebaseApp.initializeApp(options);
			log.info("Start FCM client sucessfully....");
			return FirebaseMessaging.getInstance(app);
	 }
}
