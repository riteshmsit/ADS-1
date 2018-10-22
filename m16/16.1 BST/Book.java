/**binarytreesearch.**/
class Book {
	String name;
	String author;
	Float price;
	Book(final String n, final String author1, final Float price1) {
		this.name = n;
		this.author = author1;
		this.price = price1;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return value
	 */
	public String getname() {
		return this.name;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return value
	 */
	public String getauthor() {
		return this.author;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return value
	 */
	public Float getprice() {
		return this.price;
	}
	/**
	 * @brief [brief description]
	 * @details [long description]
	 * Time complexity is O(1)
	 * @return value
	 */
	public int compareTo(Book that) {
		if(this.getname().compareTo(that.getname()) > 0) {
			return 1;
		} else if(this.getname().compareTo(that.getname()) < 0) {
			return -1;
		} else if(this.getauthor().compareTo(that.getauthor()) < 0) {
			return -1;
		} else if(this.getauthor().compareTo(that.getauthor()) > 0) {
			return 1;
		} else if(this.getprice() > that.getprice()) {
			return 1;
		} else if(this.getprice() < that.getprice()) {
			return -1;
		} else {
			return 0;
		}
	}
}

