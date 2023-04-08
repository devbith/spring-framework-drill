package com.sample.processor;

import com.sample.dto.SampleRecord;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
public class FileRecordProcessor implements RecordProcessor {

  @Override
  public Collection<SampleRecord> processRecords(Collection<SampleRecord> records) {
    System.out.println("FileRecordProcessor.processRecords");
    return null;
  }
}
