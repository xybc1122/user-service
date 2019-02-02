package com.dt.user.utils;

import java.util.List;

public class ArrUtils {
    /**
     * 两个List比较 顺序不一样也没事
     *
     * @param oneList
     * @param twoList
     * @return
     */
    public static boolean equalList(List<String> oneList, List twoList) {
        if (twoList == null) {
            return false;
        }
        if (oneList.size() != twoList.size()) {
            return false;
        } else {
            return oneList.containsAll(twoList);
        }
    }

    /**
     * 两个List比较 顺序也必须一样
     *
     * @return
     */
    public static boolean eqOrderList(List<String> oneList, List<String> twoList) {
        if (twoList == null) {
            return false;
        }
        if (oneList.size() != twoList.size()) {
            return false;
        }
        for (int i = 0; i < oneList.size(); i++) {
            // System.out.println(twoList.get(i).trim());
            if (!(oneList.get(i)).equals(twoList.get(i).trim())) {
                return false;
            }
        }
        return true;
    }

    /**
     * 泛型List
     *
     * @param <T>
     * @return
     */
    public static <T> T listT(List<?> tList) {
        return (T) tList;
    }
}