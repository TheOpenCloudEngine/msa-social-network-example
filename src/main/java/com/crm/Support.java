package com.crm;

import org.eclipse.persistence.annotations.Multitenant;
import org.eclipse.persistence.annotations.TenantDiscriminatorColumn;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by uengine on 2017. 10. 15..
 */
@Entity
@Multitenant
@TenantDiscriminatorColumn(
        name = "TENANTID",
        contextProperty = "tenant-id"
)
public class Support {

    @Id
    @GeneratedValue
    Long id;

    Date supportDate;
    String content;

    String assignee;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="ticketId")
//    Ticket ticket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSupportDate() {
        return supportDate;
    }

    public void setSupportDate(Date supportDate) {
        this.supportDate = supportDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public Ticket getTicket() {
//        return ticket;
//    }
//
//    public void setTicket(Ticket ticket) {
//        this.ticket = ticket;
//    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }



}
