package ru.smurtazin;

import java.util.*;
import java.util.stream.Collectors;

public class NearArray {

  public static void main(String[] args) {
    List<Integer> initArr = Arrays.asList(11, 2, 10, 5);
//    List<Integer> initArr = Arrays.asList(11, 2, 10, 5, 1);

    System.out.println("Init array: " + initArr);
    System.out.println("Sorted init array: " + sort(initArr));

    Tuple2 ans = NearArray.twoNearArrays(initArr);

    System.out.println("First array: " + ans.left);
    System.out.println("Second array: " + ans.right);
  }

  static List<Integer> sort(List<Integer> initList) {
    return initList.stream().sorted().collect(Collectors.toList());
  }

  static Tuple2 twoNearArrays(List<Integer> initList) {
    Tuple2 answer = new Tuple2(Collections.emptyList(), Collections.emptyList());

    List<Integer> srtdInitList = sort(initList);

    int length = srtdInitList.size();
    boolean odd = !(length % 2 == 0);
    boolean reverse = true;

    List<Integer> leftArr = new ArrayList<>();
    List<Integer> rightArr = new ArrayList<>();

//     answer.left.add(0); // UnsupportedOperationException

    for (int i = 0; i < length / 2; i+=2) {
      if(reverse) {
        leftArr.add(srtdInitList.get(i));
        rightArr.add(srtdInitList.get(i + 1));

        leftArr.add(srtdInitList.get(length - 1 - i));
        rightArr.add(srtdInitList.get(length - 1 - i - 1));
        reverse = !reverse;
      } else {
        rightArr.add(srtdInitList.get(i));
        leftArr.add(srtdInitList.get(i + 1));

        rightArr.add(srtdInitList.get(length - 1 - i));
        leftArr.add(srtdInitList.get(length - 1 - i - 1));
        reverse = !reverse;
      }
    }

    if(odd) {
      minSumArray(leftArr, rightArr).add(srtdInitList.get(length / 2 ));
    }

    answer.left = leftArr;
    answer.right = rightArr;

    return answer;
  }

  static int arrSum(List<Integer> list) {
    return list.stream().reduce(0, (a, b) -> a + b);
  }

  static List<Integer> minSumArray(List<Integer> left, List<Integer> right) {
    if(arrSum(left) <= arrSum(right)) {
      return left;
    } else {
      return right;
    }
  }

}

