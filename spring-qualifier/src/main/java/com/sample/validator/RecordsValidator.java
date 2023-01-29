package com.sample.validator;

import com.sample.dto.Record;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
public interface RecordsValidator {

  void validate(Collection<Record> records);

}
