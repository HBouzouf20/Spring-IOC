package com.mentoraone.emailManagerSystem;

import com.mentoraone.emailManagerSystem.configuration.AppConfig;
import com.mentoraone.emailManagerSystem.entity.User;
import com.mentoraone.emailManagerSystem.service.NotificationService;
import com.mentoraone.emailManagerSystem.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static final String message =  """
                    Bonjour,
                
                    Nous vous confirmons la réception et l’enregistrement de votre commande. ✅
                
                    📦 Commande confirmée
                    Nous allons maintenant procéder à sa préparation.
                
                    Nous vous tiendrons informé(e) de l’expédition et vous communiquerons les informations de livraison dès que votre commande sera prise en charge.
                
                    Merci pour votre confiance et à bientôt ! 🙏
                """;
    public static void main(String[] args) {
        System.out.println("--- Démarrage de l'Application Spring ---");
        User user = new User();
        user.setFullName("Bouzouf Hamza");
        user.setEmail("hamza@bouzouf.com");
        user.setPhoneNumber("+212 677889432");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService order = context.getBean(OrderService.class); // = new OrderService(context, null);
        order.sendOrderNotification(user,message);


        System.out.println("--- Fin de l'exécution ---");
    }
}