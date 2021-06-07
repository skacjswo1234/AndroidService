package exception;

// 회원 정보를 찾지 못했을 때 발생 시킬 예외
public class NotFoundMemeberInfoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5394519876596050378L;

	public NotFoundMemeberInfoException(String msg) {
		super(msg);
	}
}
