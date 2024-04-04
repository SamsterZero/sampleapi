package in.vvm.sampleapi.service.impl;

import in.vvm.sampleapi.entity.PolicyDetails;
import in.vvm.sampleapi.repository.PolicyDetailsRepo;
import in.vvm.sampleapi.service.CRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CRUDServiceImpl implements CRUDService {

    private final PolicyDetailsRepo policyDetailsRepo;

    @Override
    public Page<PolicyDetails> getPage(Pageable pageable) {
        policyDetailsRepo.findAll(pageable);
        return null;
    }
}