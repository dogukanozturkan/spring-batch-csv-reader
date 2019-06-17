package com.dogukano.csvassessment.resource;

import com.dogukano.csvassessment.model.Credit;
import com.dogukano.csvassessment.service.SalesTaxService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales-tax")
public class SalesTaxResource {

    @Autowired
    SalesTaxService salesTaxService;

    @GetMapping("/{year}/quarter/{quarter}")
    public List<Credit> getCredits(@PathVariable("year") final String year,
            @PathVariable("quarter") final String quarter) {

        // TODO Get Results from salesTaxService

        return null;
    }

}
