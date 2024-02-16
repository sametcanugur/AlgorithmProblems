package Sorular;

public class UpvotesvsDownvotes {

	public static void main(String[] args) {

		System.out.println("vote count=" + voteCount(100, 200));
	}

	public static int voteCount(int upVote, int downVote) {
		int voteCount = upVote - downVote;
		if (voteCount > 0) {
			return voteCount;
		}
		return -1;
	}
}