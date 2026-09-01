package com.rvittori.printer_colors.config;

import com.rvittori.printer_colors.services.BluePrinter;
import com.rvittori.printer_colors.services.ColorPrinter;
import com.rvittori.printer_colors.services.GreenPrinter;
import com.rvittori.printer_colors.services.RedPrinter;
import com.rvittori.printer_colors.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
