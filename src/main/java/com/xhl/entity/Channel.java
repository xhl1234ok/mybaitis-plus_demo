package com.xhl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author:xianghuilan
 * @Date:2020/02/1813:17
 */
public class Channel{

    private static final long serialVersionUID = 1L;

    /**
     * 电信组织标识主键
     */
    @TableId(value = "ORG_ID", type = IdType.INPUT)
    private Long orgId;

    /**
     * 电信组织标识-保留
     *  这个字段和org_id的值一模一样
     *  因为西藏个性化版本才需要保留这个字段，但在核心版本中不能保留，所以去掉。
     */
//    @TableField(value = "CHANNEL_ID")
//    private Long channelId;

    /**
     * 渠道编码，LOVB=CHN-0005
     */
    @TableField("CHANNEL_NBR")
    private String channelNbr;

    /**
     * 渠道名称
     */
    @TableField("CHANNEL_NAME")
    private String channelName;

    /**
     * 渠道类型。LOVB=CHN-0007。
     */
    @TableField("CHANNEL_CLASS")
    private String channelClass;

    /**
     * 渠道单元一级类，LOVB=CHN-0017
     */
    @TableField("SALES_FIRST_TYPE")
    private String salesFirstType;

    /**
     * 渠道单元二级类,LOVB=CHN-0017
     */
    @TableField("SALES_SECOND_TYPE")
    private String salesSecondType;

    /**
     * 渠道单元三级类,LOVB=CHN-0017
     */
    @TableField("SALES_THIRD_TYPE")
    private String salesThirdType;

    /**
     * 渠道单元新三级分类，LOVB=CHN-C-0024
     */
    @TableField("CHN_TYPE_CD")
    private String chnTypeCd;

    /**
     * 渠道对应组织的关联参与人标识,参与人唯一标识
     */
    @TableField("PARTY_ID")
    private Long partyId;

    /**
     * 渠道描述
     */
    @TableField("CHANNEL_DESC")
    private String channelDesc;

    /**
     * 渠道等级，LOVB=CHN-C-0025
     */
    @TableField("CHANNEL_LEVEL")
    private String channelLevel;

    /**
     * 渠道申请编号
     */
    @TableField("APPLY_CODE")
    private String applyCode;

    /**
     * 公用管理区域标识,记录区域唯一标识
     */
    @TableField("REGION_ID")
    private Long regionId;

    /**
     * 乡镇公共管理区域标识
     */
    @TableField(value = "COMMON_REGION_TOWN_ID")
    private Long commonRegionTownId;

    /**
     * 渠道照片
     *   10	正面
     20	厅内整体布局
     30	业务受理区
     40	终端销售区
     50	终端销售墙体
     60	业务体验区
     70	渠道标识照片
     80	实名制宣传公告
     90	实名制通告
     */
    @TableField(value = "CHANNEL_PHOTOS")
    private String channelPhotos;

    /**
     * 渠道单元集团ID
     */
    @TableField(value = "EXT_CHANNEL_ID")
    private String extChannelId;
    @TableField("STATUS_DATE")
    private Date statusDate;
    @TableField("STATUS_CD")
    private String statusCd;
    @TableField("CREATE_STAFF")
    private Long createStaff;

    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @TableField("CREATE_DATE")
    private Date createDate;
    @TableField("UPDATE_STAFF")
    private Long updateStaff;

    @DateTimeFormat(
            pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @TableField(
            value = "UPDATE_DATE",
            update = "now()"
    )
    private Date updateDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getChannelNbr() {
        return channelNbr;
    }

    public void setChannelNbr(String channelNbr) {
        this.channelNbr = channelNbr;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelClass() {
        return channelClass;
    }

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    public String getSalesFirstType() {
        return salesFirstType;
    }

    public void setSalesFirstType(String salesFirstType) {
        this.salesFirstType = salesFirstType;
    }

    public String getSalesSecondType() {
        return salesSecondType;
    }

    public void setSalesSecondType(String salesSecondType) {
        this.salesSecondType = salesSecondType;
    }

    public String getSalesThirdType() {
        return salesThirdType;
    }

    public void setSalesThirdType(String salesThirdType) {
        this.salesThirdType = salesThirdType;
    }

    public String getChnTypeCd() {
        return chnTypeCd;
    }

    public void setChnTypeCd(String chnTypeCd) {
        this.chnTypeCd = chnTypeCd;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
    }

    public String getChannelLevel() {
        return channelLevel;
    }

    public void setChannelLevel(String channelLevel) {
        this.channelLevel = channelLevel;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getCommonRegionTownId() {
        return commonRegionTownId;
    }

    public void setCommonRegionTownId(Long commonRegionTownId) {
        this.commonRegionTownId = commonRegionTownId;
    }

    public String getChannelPhotos() {
        return channelPhotos;
    }

    public void setChannelPhotos(String channelPhotos) {
        this.channelPhotos = channelPhotos;
    }

    public String getExtChannelId() {
        return extChannelId;
    }

    public void setExtChannelId(String extChannelId) {
        this.extChannelId = extChannelId;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}