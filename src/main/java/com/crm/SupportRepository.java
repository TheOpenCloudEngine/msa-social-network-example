package com.crm;

import org.metaworks.multitenancy.persistence.MultitenantRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by uengine on 2017. 10. 13..
 */
@RepositoryRestResource(collectionResourceRel = "supports", path="support")
public interface SupportRepository extends MultitenantRepository<Support, Long> {


}