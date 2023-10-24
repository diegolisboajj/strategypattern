package com.diegolisboajj.strategypattern.strategy.impl;

import com.diegolisboajj.strategypattern.strategy.NotificationStrategy;
import com.diegolisboajj.strategypattern.strategy.enums.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WhatsAppNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("mensagem enviada para o WhatsApp" + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.WHATSAPP;
    }
}



