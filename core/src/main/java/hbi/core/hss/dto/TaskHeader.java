package hbi.core.hss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * taskHeader实体类
 * Created by 谢子曦 on 2016/12/20
 */
@Table(name="hss_task_item_header_b")
public class TaskHeader extends BaseDTO {

    @Id
    @GeneratedValue
    private Long itemHeaderId;

    private String interfaceName;

    private String description;

    private String sourceSystemCode;

    private String dataTypeCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private String frozenFlag;

    private String  enabledFlag;

    @JsonIgnore
    private String validateClass;

    @JsonIgnore
    private Long sscId;

    @Transient
    private String userName;

    @Transient
    private String dataMeaning;

    @Transient
    private String sourceSystemName;

    //获取creationDate
    private Date creationDate;

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDataMeaning() {
        return dataMeaning;
    }

    public void setDataMeaning(String dataMeaning) {
        this.dataMeaning = dataMeaning;
    }

    public String getSourceSystemName() {
        return sourceSystemName;
    }

    public void setSourceSystemName(String sourceSystemName) {
        this.sourceSystemName = sourceSystemName;
    }

    public Long getItemHeaderId() {
        return itemHeaderId;
    }

    public void setItemHeaderId(Long itemHeaderId) {
        this.itemHeaderId = itemHeaderId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceSystemCode() {
        return sourceSystemCode;
    }

    public void setSourceSystemCode(String sourceSystemCode) {
        this.sourceSystemCode = sourceSystemCode;
    }

    public String getDataTypeCode() {
        return dataTypeCode;
    }

    public void setDataTypeCode(String dataTypeCode) {
        this.dataTypeCode = dataTypeCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(String frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    public String getValidateClass() {
        return validateClass;
    }

    public void setValidateClass(String validateClass) {
        this.validateClass = validateClass;
    }

    public Long getSscId() {
        return sscId;
    }

    public void setSscId(Long sscId) {
        this.sscId = sscId;
    }

}
