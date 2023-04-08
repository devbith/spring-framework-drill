package com.sample.reader;

import com.sample.dto.SampleRecord;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component("db-record-reader")
public class DbRecordReader implements RecordReader {

  @Override
  public Collection<SampleRecord> readRecords() {
    System.out.println("DbRecordReader.readRecords");
    return null;
  }
}
