# makeTags

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

```
makeTags("i", "Yay") → "&lt;i&gt;Yay&lt;/i&gt;"
makeTags("i", "Hello") → "&lt;i&gt;Hello&lt;/i&gt;"
makeTags("cite", "Yay") → "&lt;cite&gt;Yay&lt;/cite&gt;"
```

**Solution:**

```java
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"</"+tag+">";
}
```

> _[codingbat](http://codingbat.com/prob/p147483)_

> [< _back to readme_](FINDREPLACEREADME)