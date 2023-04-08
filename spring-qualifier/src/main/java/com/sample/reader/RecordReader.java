package com.sample.reader;

import com.sample.dto.SampleRecord;
import java.util.Collection;

public interface RecordReader {

  Collection<SampleRecord> readRecords();

}
