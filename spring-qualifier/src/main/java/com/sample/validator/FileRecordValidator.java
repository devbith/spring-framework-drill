package com.sample.validator;

import com.sample.dto.SampleRecord;
import com.sample.validator.RecordValidatorType.RecordValidatorMode;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
@RecordValidatorType(RecordValidatorMode.FILE)
public class FileRecordValidator implements RecordValidator {

  @Override
  public void validateRecord(Collection<SampleRecord> sampleRecords) {
    System.out.println("FileRecordValidator.validateRecord");
  }
}
