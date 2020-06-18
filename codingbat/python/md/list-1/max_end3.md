# max_end3

Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

```
max_end3([1, 2, 3]) → [3, 3, 3]
max_end3([11, 5, 9]) → [11, 11, 11]
max_end3([2, 11, 3]) → [3, 3, 3]
```

**Solution:**

```python
def max_end3(nums):
  if(nums[0] > nums[2]):
    return [nums[0], nums[0], nums[0]];
  return [nums[2], nums[2], nums[2]];
```

> _[codingbat](https://codingbat.com/prob/p135290)_

> [< _back to readme_](FINDREPLACEREADME)