package in.vvm.sampleapi.controller;

import in.vvm.sampleapi.entity.PolicyDetails;
import in.vvm.sampleapi.service.CRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
public class ApiController {

    private final CRUDService crudService;

    @GetMapping("/policyDetails")
    public ResponseEntity<Page<PolicyDetails>> page(Pageable pageable){
        return new ResponseEntity<>(crudService.getPage(pageable),HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }
}
