package com.sample.validator;

import com.sample.dto.Record;
import com.sample.validator.RecordsValidatorTypes.RecordValidatorMode;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
@RecordsValidatorTypes(RecordValidatorMode.FILE)
public class FileRecordsValidator implements RecordsValidator {

  @Override
  public void validate(Collection<Record> records) {
    System.out.println("FileRecordsValidator.validate");
  }
}
