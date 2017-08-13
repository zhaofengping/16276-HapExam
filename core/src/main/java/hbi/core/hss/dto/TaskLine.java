package hbi.core.hss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 谢子曦 on 2016/12/20
 */
@Table(name = "hss_task_item_line_b")
public class TaskLine extends BaseDTO {
    @Id
    @GeneratedValue
    private Long itemLineId;

    @Column
    private Long itemHeaderId;

    @Column
    private String titleText;

    @Column
    private String columnTypeCode;

    @Column
    private String columnName;

    @Column
    private Long seqNum;

    @Column
    private String valueType;

    @Column
    private Long columnLen;

    @Column
    private String valueSet;

    @Column
    private String columnFormat;

    @Column
    private String requiredFlag;

    @Column
    private String showFlag;

    @Column
    private String enableFlag;

    @Column
    private String uniqueFlag;

    @Column
    private Long displayWidth;

    @Column
    private Long sscId;

    public Long getItemLineId() {
        return itemLineId;
    }

    public void setItemLineId(Long itemLineId) {
        this.itemLineId = itemLineId;
    }

    public Long getItemHeaderId() {
        return itemHeaderId;
    }

    public void setItemHeaderId(Long itemHeaderId) {
        this.itemHeaderId = itemHeaderId;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getColumnTypeCode() {
        return columnTypeCode;
    }

    public void setColumnTypeCode(String columnTypeCode) {
        this.columnTypeCode = columnTypeCode;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Long getColumnLen() {
        return columnLen;
    }

    public void setColumnLen(Long columnLen) {
        this.columnLen = columnLen;
    }

    public String getValueSet() {
        return valueSet;
    }

    public void setValueSet(String valueSet) {
        this.valueSet = valueSet;
    }

    public String getColumnFormat() {
        return columnFormat;
    }

    public void setColumnFormat(String columnFormat) {
        this.columnFormat = columnFormat;
    }

    public String getRequiredFlag() {
        return requiredFlag;
    }

    public void setRequiredFlag(String requiredFlag) {
        this.requiredFlag = requiredFlag;
    }

    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getUniqueFlag() {
        return uniqueFlag;
    }

    public void setUniqueFlag(String uniqueFlag) {
        this.uniqueFlag = uniqueFlag;
    }

    public Long getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayWidth(Long displayWidth) {
        this.displayWidth = displayWidth;
    }

    public Long getSscId() {
        return sscId;
    }

    public void setSscId(Long sscId) {
        this.sscId = sscId;
    }

}
