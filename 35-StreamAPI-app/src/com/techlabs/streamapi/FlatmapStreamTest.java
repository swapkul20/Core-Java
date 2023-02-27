package com.techlabs.streamapi;

import java.util.Arrays;
import java.util.List;

public class FlatmapStreamTest {

	public static void main(String[] args) {
		List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(11,22,33), Arrays.asList(111,222,3333));
        int sum=list.stream().flatMap(l->l.stream()).reduce(0,(x,y)->x+y);
        System.out.println(sum);
	}

}
