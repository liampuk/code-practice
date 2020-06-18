public int triangle(int rows) {
  return rows == 0 || rows == 1 ? rows : rows + triangle(rows-1);
} 
