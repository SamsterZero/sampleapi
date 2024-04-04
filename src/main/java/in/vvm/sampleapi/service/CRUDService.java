package in.vvm.sampleapi.service;

import in.vvm.sampleapi.entity.PolicyDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CRUDService {

    public Page<PolicyDetails> getPage(Pageable pageable);
}