package com.sample.reader;

import com.sample.dto.SampleRecord;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component("file-record-reader")
public class FileRecordReader implements RecordReader {

  @Override
  public Collection<SampleRecord> readRecords() {
    System.out.println("FileRecordReader.readRecords");
    return null;
  }
}
