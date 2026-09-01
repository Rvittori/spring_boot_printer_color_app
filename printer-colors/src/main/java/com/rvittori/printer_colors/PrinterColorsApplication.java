package com.rvittori.printer_colors;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rvittori.printer_colors.services.ColorPrinter;


@SpringBootApplication
@Log
public class PrinterColorsApplication implements CommandLineRunner {

	private ColorPrinter colorPrinter;

	public PrinterColorsApplication(ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(PrinterColorsApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(colorPrinter.print());
	}
}
