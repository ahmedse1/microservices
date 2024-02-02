package com.example.accounts.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/* new type of class introduced in Java 17 to be used
   when its properties should not be changed and only for read purpose.
   Provides alternative method of making a final class/properties.
   It makes the properties final and creates the constructor, and
   setter and getter methods behind the scenes.

 */

@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDTO(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
