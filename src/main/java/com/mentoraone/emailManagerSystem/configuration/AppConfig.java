package com.mentoraone.emailManagerSystem.configuration;

import com.mentoraone.emailManagerSystem.service.NotificationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * ---- Fichier AppConfig.java ----
 * POURQUOI @Configuration et @ComponentScan ?
 * Spring a besoin de savoir OÙ chercher les annotations @Component.
 * @ComponentScan("com.tp.spring") indique le package de base à scanner.
 */
//@Configuration
//@ComponentScan(basePackages = "com.mentoraone.emailManagerSystem")
//@PropertySource("classpath:application.properties")
public class AppConfig {
    // La classe peut rester vide, elle sert juste de point d'entrée pour la configuration
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    @Primary
    public NotificationService notificationService(ApplicationContext context, @Value("${app.notification.type:email}") String type) {
       if (!context.containsBean(type)) {
           System.err.println("Notification type '" + type + "' is not defined. Falling back to 'email'.");
           type = "email"; // Fallback to email if the specified type is not found
       }
       return context.getBean(type, NotificationService.class);
    }
}