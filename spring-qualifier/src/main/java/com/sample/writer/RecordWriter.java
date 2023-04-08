package com.sample.writer;

import com.sample.dto.SampleRecord;
import java.util.Collection;

public interface RecordWriter {

  void writeRecords(Collection<SampleRecord> records);

}
