package com.crm;

import org.eclipse.persistence.annotations.Multitenant;
import org.eclipse.persistence.annotations.TenantDiscriminatorColumn;
import org.metaworks.multitenancy.persistence.BeforeSave;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by uengine on 2017. 10. 15..
 */
@Entity
@Multitenant
@TenantDiscriminatorColumn(
        name = "TENANTID",
        contextProperty = "tenant-id"
)
public class Ticket implements BeforeSave{

    @Id
    @GeneratedValue
    Long id;

    Date issueDate;

    String type;
    String title;
    String content;
    String status;

    @JoinColumn(name = "customerId")
    @ManyToOne(fetch = FetchType.EAGER) //Important:  only joinColumn, Spring Hateoas doesn't provide aggregate function.
    Customer raiser;

    @OneToMany
    List<Support> supports;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getRaiser() {
        return raiser;
    }

    public void setRaiser(Customer raiser) {
        this.raiser = raiser;
    }

    public List<Support> getSupports() {
        return supports;
    }

    public void setSupports(List<Support> supports) {
        this.supports = supports;
    }



    @Override
    public void beforeSave() {
        System.out.println(getRaiser());
    }
}
