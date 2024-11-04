package org.design_patterns.behaviour.template;

public class Main {
    public static void main(String[]args){

        // Create a PDF CV report generator
        CVReportGenerator pdfCVReportGenerator = new PdfCvReportGenerator();
        GeneratedReport generatedCVPdfReport = pdfCVReportGenerator.generateCVReport("/temp/cv.pdf");
        System.out.println(generatedCVPdfReport.toString());
        System.out.println("---------------------------------------------------");

        // Create a Word CV report generator
        CVReportGenerator wordCVReportGenerator = new WordCvReportGenerator();
        GeneratedReport generatedWordCvReport = wordCVReportGenerator.generateCVReport("/temp/cv.docx");
        System.out.println(generatedWordCvReport.toString());
        System.out.println("---------------------------------------------------");

        // Create an Image CV report generator
        CVReportGenerator imageCVReportGenerator = new ImageCvReportGenerator();
        GeneratedReport generatedImageCvReport = imageCVReportGenerator.generateCVReport("/temp/cv.png");
        System.out.println(generatedImageCvReport.toString());
    }
}
