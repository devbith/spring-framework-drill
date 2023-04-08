package com.sample.processor;

import com.sample.dto.SampleRecord;
import java.util.Collection;

public interface RecordProcessor {

  Collection<SampleRecord> processRecords(Collection<SampleRecord> records);

}
