package com.zipcodewilmington.assessment1.part2;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
//        List<Integer> withEven = new LinkedList<>();
//        List<Integer> withoutEven = new LinkedList<>();
//        for(int element : ints){
//            if(element % 2 == 0){
//                withEven.add(element);
//            }else{
//                withoutEven.add(element);
//            }
//        }
//        return withoutEven.toArray(new Integer[0]);
//        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer idx : ints) {
            if (idx % 2 != 0) {
                result.add(idx);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
//        List<Integer> withEven = new LinkedList<>();
//        List<Integer> withOut = new LinkedList<>();
//        for(int element : ints){
//            if(element % 2 == 0){
//                withEven.add(element);
//            }else{
//                withOut.add(element);
//            }
//        }
//        return withEven.toArray(new Integer[0]);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer idx : ints) {
            if (idx % 2 == 0) {
                result.add(idx);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
//        List<Integer> mulipleOfThree = new LinkedList<>();
//        List<Integer> notMultiple = new LinkedList<>();
//        for(int element : ints){
//            if(element % 3 == 0){
//                mulipleOfThree.add(element);
//            }else{
//                notMultiple.add(element);
//            }
//        }
//        return notMultiple.toArray(new Integer[0]);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer idx : ints) {
            if (idx % 3 != 0) {
                result.add(idx);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
//        List<Integer> multiples = new LinkedList<>();
//        List<Integer> notMultiples = new LinkedList<>();
//        for(int element : ints){
//            if(element % multiple == 0){
//                multiples.add(element);
//            }else{
//                notMultiples.add(element);
//            }
//        }
//        return notMultiples.toArray(new Integer[0]);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer idx : ints) {
            if (idx % multiple != 0) {
                result.add(idx);
            }
        }
        return result.toArray(new Integer[result.size()]);

    }
}
