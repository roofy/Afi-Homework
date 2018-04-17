class Element {
	public int num;
	public Element next;

	public Element(int n) {
		this.num = n;
	}
}

class List {
	public Element first, last;

	public List(Element first, Element last) {
		this.first = first;
		this.last = last;
	}
}

int get_snd_largest_iterative(List L) {
	Element current = L.first;
	int largest = current.num, secondLargest = 0;

	do {
		current = current.next;

	if (current.num > largest) {
		secondLargest = largest;
			largest = current.num;
		} else {
			if (current.num > secondLargest)
				secondLargest = current.num;
		}

	} while (current != L.last);

	return secondLargest;
}

int get_snd_largest_recursive(Element e, int largest, int secondLargest) {
	if (e.num > largest) {
		secondLargest = largest;
		largest = e.num;
	} else {
		if (e.num > secondLargest)
			secondLargest = e.num;
	}

	if (e.next == null)
		return secondLargest;

	return get_snd_largest_recursive(e.next, largest, secondLargest);
}

int get_snd_largest_recursive(List L) {
	return get_snd_largest_recursive(L.first, 0, 0);
}
