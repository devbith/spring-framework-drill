package com.sample.validator;

import com.sample.dto.SampleRecord;
import java.util.Collection;

public interface RecordValidator {

  void validateRecord(Collection<SampleRecord> sampleRecords);

}
