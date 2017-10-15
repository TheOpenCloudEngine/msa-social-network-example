package com.crm;

import org.metaworks.multitenancy.persistence.MultitenantRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by uengine on 2017. 10. 13..
 */
@RepositoryRestResource(collectionResourceRel = "customers", path="customer")
public interface CustomerRepository extends MultitenantRepository<Customer, String> {


}