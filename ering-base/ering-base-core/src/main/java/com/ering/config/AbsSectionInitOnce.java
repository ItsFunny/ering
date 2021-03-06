package com.ering.config;

import com.ering.enums.ConfigurableEnums;
import com.ering.exceptions.ConfigException;

/**
 * @author Charlie
 * @When
 * @Description
 * @Detail
 * @Attention:
 * @Date 创建时间：2020-12-17 22:13
 */
public abstract  class AbsSectionInitOnce extends AbstractInitOnce implements ISectionConfigurable
{
    @Override
    public ConfigurableEnums configurable()
    {
        return ConfigurableEnums.SECTION;
    }

    @Override
    protected void init() throws ConfigException
    {
        this.config();
    }
}
