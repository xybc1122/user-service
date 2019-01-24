package com.dt.user.utils;

import com.dt.user.model.Timing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CrrUtils {


    /**
     * Long 类型++
     *
     * @param numberCount
     */
    public static void inCreateNumberLong(ThreadLocal<Long> numberCount) {
        Long myNumberCount = numberCount.get();
        myNumberCount++;
        numberCount.set(myNumberCount);
    }

    /**
     * Long 类型++
     */
    public static void delCreateNumberLong(ThreadLocal<Long> numberCount) {
        Long myNumberCount = numberCount.get();
        myNumberCount--;
        numberCount.set(myNumberCount);
    }

    //set并发add
    public static void inCreateSet(ThreadLocal<Set<Timing>> timingSet, Timing timing) {
        Set<Timing> timings = timingSet.get();
        if (timings == null) {
            timings = new HashSet<>();
        }
        timings.add(timing);
        timingSet.set(timings);
    }

    //List清空数据
    public static void delList(ThreadLocal<List<List<String>>> timingList) {
        List<List<String>> timings = timingList.get();
        if (timings != null && timings.size() > 0) {
            timings.clear();
            timingList.set(timings);
        }
    }

    public static List<List<String>> inCreateList(ThreadLocal<List<List<String>>> timingList) {
        List<List<String>> strList = timingList.get();
        if (strList == null) {
            strList = new ArrayList<>();
            timingList.set(strList);
        }
        return strList;
    }

    /**
     * Integer 类型++
     *
     * @param numberCount
     */
    public static void inCreateNumberInteger(ThreadLocal<Integer> numberCount) {
        Integer myNumberCount = numberCount.get();
        myNumberCount++;
        numberCount.set(myNumberCount);
    }
}
