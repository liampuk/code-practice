public String alarmClock(int day, boolean vacation) {
  if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5){
    return vacation ? "10:00" : "7:00"; 
  }
  return vacation ? "off" : "10:00"; 
}
