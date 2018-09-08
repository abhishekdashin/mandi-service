package com.perfios.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Field
{
    private List< FieldItem > item = new ArrayList< FieldItem >();

    public List<FieldItem> getItem() {
        return item;
    }

    public void setItem(List<FieldItem> item) {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = "+item+"]";
    }
}
