package org.example;

import org.example.Printer.Printable;
import org.example.Printer.LG;
import org.example.Printer.Samsung;

public class Ex06 {
    public static void main(String[] args) {
        String mydoc = "mydocument";

        Printable prn = new Samsung();
        prn.print(mydoc);

        prn = new LG();
        prn.print(mydoc);
    }
}
