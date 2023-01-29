package com.sample.service;

import com.sample.bls.RecordsProcessor;
import com.sample.validator.RecordsValidator;
import com.sample.validator.RecordsValidatorTypes;
import com.sample.validator.RecordsValidatorTypes.RecordValidatorMode;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

  @Autowired
  @Qualifier("db-records-processor")
  private RecordsProcessor recordsProcessor;

  @Autowired
  @RecordsValidatorTypes(RecordValidatorMode.FILE)
  private RecordsValidator recordsValidator;

  public void processRecord() {
    this.recordsProcessor.processRecords(Collections.emptyList());
    this.recordsValidator.validate(Collections.emptyList());
  }

}
