package com.sample.validator;

import com.sample.dto.SampleRecord;
import com.sample.validator.RecordValidatorType.RecordValidatorMode;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
@RecordValidatorType(RecordValidatorMode.DB)
public class DbRecordValidator implements RecordValidator {

  @Override
  public void validateRecord(Collection<SampleRecord> sampleRecords) {
    System.out.println("DbRecordValidator.validateRecord");
  }
}
