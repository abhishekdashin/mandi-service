package com.perfios.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {
    private String index_name;
    private String title;
    private String desc;
    private String created;
    private String updated;
    private String created_date;
    private String updated_date;
    private String active;
    private String visualizable;
    private String catalog_uuid;
    private String source;
    private String org_type;
    Org OrgObject;
    Sector SectorObject;
    Field FieldObject;
    Target_bucket Target_bucketObject;
    private String status;
    private String message;
    private String total;
    private String count;
    private String limit;
    private String offset;
    Records RecordsObject;
    private String version;


    // Getter Methods

    public String getIndex_name() {
        return index_name;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public String getActive() {
        return active;
    }

    public String getVisualizable() {
        return visualizable;
    }

    public String getCatalog_uuid() {
        return catalog_uuid;
    }

    public String getSource() {
        return source;
    }

    public String getOrg_type() {
        return org_type;
    }

    public Org getOrg() {
        return OrgObject;
    }

    public Sector getSector() {
        return SectorObject;
    }

    public Field getField() {
        return FieldObject;
    }

    public Target_bucket getTarget_bucket() {
        return Target_bucketObject;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getTotal() {
        return total;
    }

    public String getCount() {
        return count;
    }

    public String getLimit() {
        return limit;
    }

    public String getOffset() {
        return offset;
    }

    public Records getRecords() {
        return RecordsObject;
    }

    public String getVersion() {
        return version;
    }

    // Setter Methods

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setVisualizable(String visualizable) {
        this.visualizable = visualizable;
    }

    public void setCatalog_uuid(String catalog_uuid) {
        this.catalog_uuid = catalog_uuid;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public void setOrg(Org orgObject) {
        this.OrgObject = orgObject;
    }

    public void setSector(Sector sectorObject) {
        this.SectorObject = sectorObject;
    }

    public void setField(Field fieldObject) {
        this.FieldObject = fieldObject;
    }

    public void setTarget_bucket(Target_bucket target_bucketObject) {
        this.Target_bucketObject = target_bucketObject;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public void setRecords(Records recordsObject) {
        this.RecordsObject = recordsObject;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}