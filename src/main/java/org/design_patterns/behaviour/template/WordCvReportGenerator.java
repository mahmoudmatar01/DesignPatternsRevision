package org.design_patterns.behaviour.template;

import java.io.File;

public class WordCvReportGenerator extends CVReportGenerator{
    @Override
    public ExtractedData extractDataFromCv(File cvFile) {
        System.out.println("Extracted data from cv file : "+cvFile.getAbsolutePath());
        return new ExtractedData("Extracted data from cv word file");
    }

    @Override
    protected GeneratedReport generateFinalReport(AnalyzedData analyzedData) {
        System.out.println("Generated reported about word cv : " + analyzedData.analyzedData());
        return new GeneratedReport("Generated reported about word cv : " + analyzedData.analyzedData());
    }
}
