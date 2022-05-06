package lecture.c03core;

public class Servlet1 {
	private Dao1 dao = new Dao1(); // dependancy

	public void doGet() {
		// request parameter 수집 및 가공
		// business logic 처리
		dao.select();		
		// 결과 세팅
		// forward / redirect
	}
}
