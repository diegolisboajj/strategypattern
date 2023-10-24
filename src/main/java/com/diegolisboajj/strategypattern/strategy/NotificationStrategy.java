package com.diegolisboajj.strategypattern.strategy;

import com.diegolisboajj.strategypattern.strategy.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);

    NotificationType notificationType();
}
