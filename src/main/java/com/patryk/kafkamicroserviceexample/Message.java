package com.patryk.kafkamicroserviceexample;

import java.time.LocalDateTime;

public record Message(String message,
                      LocalDateTime created) {
}
