# VigenereCipher
Implementation of Vigenere Cipher

## Implementation

### Vigenere Class
<pre>private static String alphabets = "abcdefghijklmnopqrstuvwxyz";</pre> variable for storing English alphabets. You may store any other scheme.

<pre>private static char[][] vigenereMatrix = new char[26][26];</pre> is a char type array for storing the arrangement of shifts for each row and column.

<pre>public static String compress(String text)</pre> function takes out all other characters except alphabets and translates uppercase to lowercase characters.

<pre>public static String fiveLetterWords(String text)</pre> function inserts spaces after every five characters.

<pre>public static String encode(String message, String key)</pre> function encodes the provided message using the provided key. <em>Init</em> function call creates the 2D vigenere matrix. The indexes of characters in message and key are used to encrypt the message.
<em>i % key.length()</em> keeps the key iterator within the key length.
<em>key.toCharArray()</em> is to convert the string to char array.
<em>alphabets.indexOf()</em> is to get the index of a character present in the alphabet variable.
<p>We have used a String Builder to create an encrypted string.</p>

<pre>public static String decode(String codedText, String key)</pre> uses the key to determine the number of shifts and hence decode the message.

### Task Class

<p>This class consists of code for the menu. The user will be asked to input string and key at the start. Then he can choose to either encode or decode the message with the key.</p>
