package com.perfios.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sector
{
    private List< String > item = new ArrayList();;

    public List<String> getItem() {
        return item;
    }

    public void setItem(List<String> item) {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = "+item+"]";
    }
}
