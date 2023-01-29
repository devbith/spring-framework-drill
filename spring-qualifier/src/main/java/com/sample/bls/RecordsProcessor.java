package com.sample.bls;

import com.sample.dto.Record;
import java.util.Collection;
import org.springframework.stereotype.Component;

@Component
public interface RecordsProcessor {

   Collection<Record> processRecords(Collection<Record> records);

}
