package com.crm;

import org.eclipse.persistence.annotations.Multitenant;
import org.eclipse.persistence.annotations.TenantDiscriminatorColumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by uengine on 2017. 10. 13..
 */
@Entity
@Multitenant
@TenantDiscriminatorColumn(
        name = "TENANTID",
        contextProperty = "tenant-id"
)
public class Customer {

    @Id
    @GeneratedValue
    String id;

    String name;
    String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
