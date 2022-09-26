***unicode system***

```text

Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.

```

***why java uses Unicode System?***

```text

before Unicode there were many language standards

```

- ASCII (American Standard Code for Information Interchange) for the United States.
- ISO 8859-1 for Western European Language.
- KOI-8 for Russian.
- GB18030 and BIG-5 for chinese, and so on.


***Problems***

this caused two problems

1. A particular code value corresponds to different letters in the various language standards.
2. The encodings for languages with large character sets have variable length.Some common characters are encoded as single bytes, other require two or more byte.


***Solution***

```text

To solve these problems, a new language standard was developed i.e. Unicode System.
In unicode, character holds 2 byte, so java also uses 2 byte for characters.

lowest value:\u0000
highest value:\uFFFF

```