def balance(chars: List[Char]): Boolean = {
  def loop(acc: Int, chars: List[Char]): Boolean =
    if (acc < 0 | (chars.isEmpty & acc != 0)) false
    else if (chars.isEmpty) true
    else if (chars.head == '(') loop(acc + 1, chars.tail)
    else if (chars.head == ')') loop(acc - 1, chars.tail)
    else loop(acc, chars.tail)
  loop(0, chars)
}

balance("this is a ) test".toList)