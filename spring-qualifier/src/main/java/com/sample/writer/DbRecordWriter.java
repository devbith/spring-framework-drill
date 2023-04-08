package com.sample.writer;

import com.sample.dto.SampleRecord;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("db-record-writer")
public class DbRecordWriter implements RecordWriter {

  @Override
  public void writeRecords(Collection<SampleRecord> records) {
    System.out.println("DbRecordWriter.writeRecords");
  }
}
