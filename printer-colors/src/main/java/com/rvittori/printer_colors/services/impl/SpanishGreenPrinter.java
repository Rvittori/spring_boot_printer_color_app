package com.rvittori.printer_colors.services.impl;

import com.rvittori.printer_colors.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "verde";
    }

}
