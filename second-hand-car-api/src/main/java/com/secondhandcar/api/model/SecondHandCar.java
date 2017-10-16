package com.secondhandcar.api.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 二手车
 * Created by xiet on 2017/10/13.
 */
@Data
@TableName("second_hand_car")
public class SecondHandCar extends Model<SecondHandCar> implements Serializable{
    /**
     * 主键id
     */
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;


    /**
     * 车辆ID
     */
//    @TableField("car_id")
    private String carId;

    /**
     * 车辆标题
     */
    private String title;

    /**
     * 上牌日期
     */
    @TableField("license_date")
    private String licenseDate;

    /**
     * 行驶里程
     */
    @TableField("road_haul")
    private String roadHaul;

    /**
     * 缩略图
     */
    @TableField("thumb_img")
    private String thumbImg;

    /**
     * 总价
     */
    private String price;

    /**
     * 首付
     */
    @TableField("first_pay")
    private String firstPay;

    /**
     * 是否新上架
     */
    @TableField("new_post")
    private String newPost;

    /**
     * 热门属性
     */
    private transient List<SecondHandCarHotParam> secondHandCarHotParamList;

    /**
     * 版本（乐观锁保留字段）
     */
    private Integer version;
    /**
     * 排序
     */
    private Integer orderNo;

    private Date createTime;

    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
