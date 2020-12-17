package com.ering.config;

import com.ering.enums.ConfigurableEnums;
import com.ering.exceptions.ConfigException;

/**
 * @author Charlie
 * @When
 * @Description
 * @Detail
 * @Attention:
 * @Date 创建时间：2020-12-17 22:17
 */
public abstract class AbsIntergrationInitOnce extends AbstractInitOnce implements  IIntegrationConfigurable
{
    @Override
    protected void init() throws ConfigException
    {
        this.config();
    }

    @Override
    public ConfigurableEnums configurable()
    {
        return ConfigurableEnums.INTEGRATED;
    }
}
