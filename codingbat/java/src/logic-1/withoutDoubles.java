public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  return die1 == die2 && noDoubles ? die1+1 == 7 ? 1+die2 : die1+1+die2 : die1+die2;
}
