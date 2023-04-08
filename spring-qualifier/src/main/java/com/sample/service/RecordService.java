package com.sample.service;

import com.sample.processor.RecordProcessor;
import com.sample.reader.RecordReader;
import com.sample.validator.RecordValidator;
import com.sample.validator.RecordValidatorType;
import com.sample.validator.RecordValidatorType.RecordValidatorMode;
import com.sample.writer.RecordWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

  @Autowired
  @Qualifier("dbRecordProcessor")
  private RecordProcessor recordProcessor;

  @Autowired
  @Qualifier("db-record-reader")
  private RecordReader recordReader;

  @Autowired
  @Qualifier("db-record-writer")
  private RecordWriter recordWriter;

  @Autowired
  @RecordValidatorType(RecordValidatorMode.FILE)
  private RecordValidator recordValidator;



}
