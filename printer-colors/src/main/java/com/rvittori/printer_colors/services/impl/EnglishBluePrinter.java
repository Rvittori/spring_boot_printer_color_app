package com.rvittori.printer_colors.services.impl;

import com.rvittori.printer_colors.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
