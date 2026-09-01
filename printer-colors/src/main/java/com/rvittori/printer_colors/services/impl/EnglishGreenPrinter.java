package com.rvittori.printer_colors.services.impl;

import com.rvittori.printer_colors.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }

}
