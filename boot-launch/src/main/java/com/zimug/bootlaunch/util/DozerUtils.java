package com.zimug.bootlaunch.util;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DozerUtils {
    static DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        List destionationList = Lists.newArrayList();
        for (Iterator i$ = sourceList.iterator(); i$.hasNext(); ) {
            Object sourceObj = i$.next();
            Object destionObj = dozerBeanMapper.map(sourceObj, destinationClass);
            destionationList.add(destionObj);
        }
        return destionationList;
    }
}