package com.mentoraone.emailManagerSystem;

import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmailManagerSystem implements CommandLineRunner {
    private final OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(EmailManagerSystem.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- 🚀 APPLICATION DÉMARRÉE AVEC SUCCÈS ---");
       /* User user = new User();
        user.setFullName("Bouzouf Hamza");
        user.setEmail("hamza@bouzouf.com");
        user.setPhoneNumber("+212 6 00 00 00 00");
        // Test de notre architecture faiblement couplée
        orderService.sendOrderNotification(user, message);

        System.out.println("-------------------------------------------\n");*/

    }
}