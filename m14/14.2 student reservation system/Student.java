/**student.**/
class Student {
    /**
     * variable.
     */
    private String name;
    /**
     * variable.
     */
    private String dob;
    /**
     * variable.
     */
    private int sub1;
    /**
     * variable.
     */
    private int sub2;
    /**
     * variable.
     */
    private int sub3;
    /**
     * variable.
     */
    private int total;
    /**
     * variable.
     */
    private String reservation;
    /**
     * variable.
     */
    private int vacancy;
    /**
     * variable.
     */
    private int unreserved;
    /**
     * variable.
     */
    private int bc;
    /**
     * variable.
     */
    private int sc;
    /**
     * variable.
     */
    private int st;
    /**
     * time complexity is O(1).
     * @return value
     */
    public int getage() {
        int age = 0;
        final int year = 2018, days = 365, month = 30, ten = 10;
        String s = "-";
        String[] token = this.getdob().split(s);
        age += (year - Integer.parseInt(token[2])) * days;
        age += (ten - Integer.parseInt(token[1])) * month;
        age += Integer.parseInt(token[0]);
        return age;
    }
    /**
     * @param name1 value
     * @param dob1 value
     * @param s1 value
     * @param s2 value
     * @param s3 value
     * @param total1 value
     * @param res1 value
     */
    Student(final String name1, final String dob1, final int s1, final int s2,
        final int s3, final int total1, final String res1) {
        this.name = name1;
        this.dob = dob1;
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.total = total1;
        this.reservation = res1;
    }
    /**
     * time complexity is 1..
     * ..
     * @return value
     */
    public String getname() {
        return this.name;
    }
    /**
     * time complexity is 1.
     *@return value
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * time complexity is 1.
     * @return value
     */
    public int get1() {
        return this.sub1;
    }
    /**
     * time complexity is 1.
     * @return value
     */
    public int get2() {
        return this.sub2;
    }
    /**
     * time complexity is 1.
     * @return value
     */
    public int get3() {
        return this.sub3;
    }
    /**
     * time complexity is 1.
     * @return value
     */
    public int gettotal() {
        return this.total;
    }
    /**
     * time complexity is 1.
     * @return value
     */
    public String getreserve() {
        return this.reservation;
    }
    /**
     * @return value
     */
    public String print() {
        return this.getname() + "," + this.gettotal() + "," + this.getreserve();
    }
    /**
     * time complexity is 1.
     * @param that value
     * @return value
     */
    public int compare(final Student that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        } else if (this.gettotal() < that.gettotal()) {
            return -1;
        } else if (this.get3() > that.get3()) {
            return 1;
        } else if (this.get3() < that.get3()) {
            return -1;
        } else if (this.get2() > that.get2()) {
            return 1;
        } else if (this.get2() < that.get2()) {
            return -1;
        } else if (this.getage() > that.getage()) {
            return -1;
        } else if (this.getage() < that.getage()) {
            return 1;
        } else {
        return 0;
    }
}
}


