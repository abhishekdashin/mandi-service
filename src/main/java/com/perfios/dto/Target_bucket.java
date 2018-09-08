package com.perfios.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Target_bucket
{
    private String index;

    private String type;

    public String getIndex ()
    {
        return index;
    }

    public void setIndex (String index)
    {
        this.index = index;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [index = "+index+", type = "+type+"]";
    }
}
