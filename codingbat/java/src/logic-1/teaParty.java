public int teaParty(int tea, int candy) {
  return tea<5||candy<5?0:tea>=candy*2||candy>=tea*2?2:1;
}
