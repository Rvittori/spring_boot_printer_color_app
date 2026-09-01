package com.rvittori.printer_colors.services.impl;

import com.rvittori.printer_colors.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
