package com.sample.bls;

import com.sample.dto.Record;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component("db-records-processor")
public class DbRecordsProcessor implements RecordsProcessor {

  @Override
  public Collection<Record> processRecords(Collection<Record> records) {
    System.out.println("DbRecordsProcessor.processRecords");
    return records;
  }
}
