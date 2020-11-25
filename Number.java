public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if(getValue() == other.getValue()) return 0;
    if(getValue() < other.getValue()) return -1;
    else return 1;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if(getValue() == 0 && other.getValue() == 0) return true;
    double difference = Math.abs(getValue() - other.getValue());
    if(difference < 0.00001 * getValue() && difference < 0.00001 * other.getValue()) return true;
    return false;
  }
}