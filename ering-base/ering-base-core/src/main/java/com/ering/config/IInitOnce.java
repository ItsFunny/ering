package com.ering.config;

import com.ering.exceptions.ConfigException;

/**
 * @author Charlie
 * @When
 * @Description
 * @Detail
 * @Attention:
 * @Date 创建时间：2020-10-20 23:12
 */
public interface IInitOnce
{
    void initOnce() throws ConfigException;
}
