package com.sample.bls;

import com.sample.dto.Record;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component("file-records-processor")
public class FileRecordsProcessor implements RecordsProcessor {

  @Override
  public Collection<Record> processRecords(Collection<Record> records) {
    System.out.println("FileRecordsProcessor.processRecords");
    return records;
  }
}
