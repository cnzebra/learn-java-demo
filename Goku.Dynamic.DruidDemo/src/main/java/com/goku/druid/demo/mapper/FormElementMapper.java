package com.goku.druid.demo.mapper;

import com.goku.druid.demo.model.FormElement;

public interface FormElementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    int insert(FormElement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    int insertSelective(FormElement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    FormElement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FormElement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form_element_
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FormElement record);
}