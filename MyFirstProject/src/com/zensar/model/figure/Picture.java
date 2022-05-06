package com.zensar.model.figure;

public class Picture {

	Parallelogram[] parallelogram = new Parallelogram[4];

//	ArrayList<Parallelogram> pgms = new ArrayList<Parallelogram>(Arrays.asList(parallelogram));

	public Parallelogram[] getParallelogram() {
		return parallelogram;
	}

	public Picture() {
		super();
	}

	public Picture(Parallelogram[] parallelogram) {
		super();
		this.parallelogram = parallelogram;
	}

	public void setParallelogram(Parallelogram[] parallelogram) {
		this.parallelogram = parallelogram;
	}

	public boolean add(Parallelogram pgm) {
		for (int i = parallelogram.length - 1; i > 0; i--) {
			if (parallelogram[i] == null) {
				parallelogram[i] = pgm;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
