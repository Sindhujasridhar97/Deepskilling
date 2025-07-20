package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccountByNumber(@PathVariable String number) {
        // Dummy response – in real apps, this would be pulled from DB/service
        return Map.of(
            "number", number,
            "type", "savings",
            "balance", 234343
        );
    }
}
