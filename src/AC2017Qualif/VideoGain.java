package AC2017Qualif;

import java.io.Serializable;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class VideoGain implements Comparable<VideoGain>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4663119527379423380L;
	public Video V;
	public double Score;
	public SortedSet<Request> ServedRequest;
	
	
	
	public VideoGain(Video v, double score) {
		super();
		V = v;
		Score = score;
		ServedRequest = Collections.synchronizedSortedSet(new TreeSet<Request>());
	}



	@Override
	public int compareTo(VideoGain o) {
		if(o==null)
			return -1;
		int c = Double.compare(o.Score,Score);
		if(c==0)
			return Integer.compare(o.V.ID,V.ID);
		return c;
		
	}
	
	
	
	
}
