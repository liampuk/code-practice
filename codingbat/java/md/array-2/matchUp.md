# matchUp

Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

```
matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
```

**Solution:**

```java
public int matchUp(int[] nums1, int[] nums2) {
  int c = 0;
  for(int i=0; i<nums1.length; i++){
    if(nums1[i] != nums2[i] && nums1[i] >= nums2[i]-2 && nums1[i] <= nums2[i]+2){
      c++;
    }
  }
  return c;
}
```

> _[codingbat](https://codingbat.com/prob/p136254)_

> [< _back to readme_](FINDREPLACEREADME)