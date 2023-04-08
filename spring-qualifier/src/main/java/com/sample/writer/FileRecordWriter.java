package com.sample.writer;

import com.sample.dto.SampleRecord;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("file-record-writer")
public class FileRecordWriter implements RecordWriter {

  @Override
  public void writeRecords(Collection<SampleRecord> records) {
    System.out.println("FileRecordWriter.writeRecords");
  }
}
