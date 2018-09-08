package com.perfios.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Records
{
    private List< RecordItems > item = new ArrayList< RecordItems >();;

    public List<RecordItems> getItem() {
        return item;
    }

    public void setItem(List<RecordItems> item) {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = "+item+"]";
    }
}
