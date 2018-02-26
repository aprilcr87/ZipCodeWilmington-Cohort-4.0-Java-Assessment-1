package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.*;


/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (Object value : objectArray){
            if(value.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }


    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
//        List<Object> newList = Arrays.asList(objectArray);
//        newList.remove(objectToRemove);
//        return newList.toArray(new Object[newList.size()]);
//
        List<Object> list = new ArrayList<>();
        Collections.addAll(list, objectArray);
        list.removeAll(Arrays.asList(objectToRemove));
        return list.toArray();

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int counter = 0;
        Object mostCommon = null;
        for(int i = 0; i <objectArray.length; i++){
            mostCommon = objectArray[i];
            counter++;
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int counter = 0;
        Object leastCommon = null;
        for (int i = 1; i < objectArray.length; i++) {
            leastCommon = objectArray[i];
                counter++;

        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
       Object newList = Arrays.copyOf(objectArray,objectArray.length + objectArrayToAdd.length);
       System.arraycopy(objectArrayToAdd, 0, newList, objectArray.length, objectArrayToAdd.length);
       return (Object[]) newList;
    }
}
