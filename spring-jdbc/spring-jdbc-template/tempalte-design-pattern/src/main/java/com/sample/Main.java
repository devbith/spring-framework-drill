package com.sample;

import com.sample.report.PdfReport;
import com.sample.report.TxtReport;
import com.sample.report.XlsReport;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) {
    new PdfReport()
        .generateReport(Paths.get("report.pdf"), "report content");

    new XlsReport()
        .generateReport(Paths.get("report.xls"), "report content");

    new TxtReport()
        .generateReport(Paths.get("report.txt"), "report content");

  }
}