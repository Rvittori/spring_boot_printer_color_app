package com.rvittori.printer_colors.services.impl;

import com.rvittori.printer_colors.services.BluePrinter;
import com.rvittori.printer_colors.services.ColorPrinter;
import com.rvittori.printer_colors.services.GreenPrinter;
import com.rvittori.printer_colors.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(",", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }


}
