class Studentdetails {
    String name;
    double marks;
    Studentdetails() {

    }
    Studentdetails(String name, double marks) {
        this.marks = marks;
        this.name = name;

    }
    // Studentdetails(int rollnumber, int choice) {
    //  this.rollnumber = rollnumber;
    //  this.choice = choice;
    // }
    public String toString() {
        return this.getname() + "," + this.getmarks();
    }
    // public int getrollnumber() {
    //  return this.rollnumber;
    // }
    public String getname() {
        return this.name;
    }
    public double getmarks() {
        return this.marks;
    }
    // public int getchoice() {
    //  return this.choice;
    // }
    // public int compareTo(Studentdetails that) {
    //  if(this.getrollnumber() > that.getrollnumber()) {
    //      return 1;
    //  } else if(this.getrollnumber() < that.getrollnumber()) {
    //      return -1;
    //  } else if (this.getrollnumber() == that.getrollnumber()) {
    //      return 0;
    //  }
    //  else if (this.getmarks() < that.getmarks()) {
    //      return -1;
    //  } else if (this.getmarks() > that.getmarks()) {
    //      return 1;
    //  } else {
    //      return 2;
    //  }
    // }
}
