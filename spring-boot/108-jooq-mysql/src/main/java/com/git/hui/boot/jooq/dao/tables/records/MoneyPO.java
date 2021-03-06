/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.dao.tables.records;


import com.git.hui.boot.jooq.dao.tables.MoneyTB;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MoneyPO extends UpdatableRecordImpl<MoneyPO> implements Record6<UInteger, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 328036610;

    /**
     * Setter for <code>test.money.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.money.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>test.money.name</code>. 用户名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.money.name</code>. 用户名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.money.money</code>. 钱
     */
    public void setMoney(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.money.money</code>. 钱
     */
    public Integer getMoney() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>test.money.is_deleted</code>.
     */
    public void setIsDeleted(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.money.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>test.money.create_at</code>. 创建时间
     */
    public void setCreateAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.money.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>test.money.update_at</code>. 更新时间
     */
    public void setUpdateAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.money.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UInteger, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return MoneyTB.MONEY.ID;
    }

    @Override
    public Field<String> field2() {
        return MoneyTB.MONEY.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return MoneyTB.MONEY.MONEY_;
    }

    @Override
    public Field<Byte> field4() {
        return MoneyTB.MONEY.IS_DELETED;
    }

    @Override
    public Field<Timestamp> field5() {
        return MoneyTB.MONEY.CREATE_AT;
    }

    @Override
    public Field<Timestamp> field6() {
        return MoneyTB.MONEY.UPDATE_AT;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getMoney();
    }

    @Override
    public Byte component4() {
        return getIsDeleted();
    }

    @Override
    public Timestamp component5() {
        return getCreateAt();
    }

    @Override
    public Timestamp component6() {
        return getUpdateAt();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getMoney();
    }

    @Override
    public Byte value4() {
        return getIsDeleted();
    }

    @Override
    public Timestamp value5() {
        return getCreateAt();
    }

    @Override
    public Timestamp value6() {
        return getUpdateAt();
    }

    @Override
    public MoneyPO value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public MoneyPO value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public MoneyPO value3(Integer value) {
        setMoney(value);
        return this;
    }

    @Override
    public MoneyPO value4(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public MoneyPO value5(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public MoneyPO value6(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    @Override
    public MoneyPO values(UInteger value1, String value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MoneyPO
     */
    public MoneyPO() {
        super(MoneyTB.MONEY);
    }

    /**
     * Create a detached, initialised MoneyPO
     */
    public MoneyPO(UInteger id, String name, Integer money, Byte isDeleted, Timestamp createAt, Timestamp updateAt) {
        super(MoneyTB.MONEY);

        set(0, id);
        set(1, name);
        set(2, money);
        set(3, isDeleted);
        set(4, createAt);
        set(5, updateAt);
    }
}
