package com.joonyoung.freeboard.dto;

public class BoardDto {
	private int bid; // 게시글 번호
	private String bname; // 글쓴이 이름 
	private String btitle; // 게시글 제목
	private String bcontent; // 게시글 내용
	private String bdate; //게시글 작성 날짜,시간
	private int bhit; // 게시글 조회수
//	private int bgroup; // 댓글 그룹 번호
//	private int bstep; // 댓글 단계 번호
//	private int bindent; // 댓글 들여쓰기
	
	public BoardDto() { // 기본생성자
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int bid, String bname, String btitle, String bcontent, String bdate, int bhit) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
//		this.bgroup = bgroup;
//		this.bstep = bstep;
//		this.bindent = bindent;
	}

	public int getBid() {
		return bid;
	}

	public String getBname() {
		return bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public String getBdate() {
		return bdate;
	}

	public int getBhit() {
		return bhit;
	}

//	public int getBgroup() {
//		return bgroup;
//	}
//
//	public int getBstep() {
//		return bstep;
//	}
//
//	public int getBindent() {
//		return bindent;
//	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public void setBhit(int bhit) {
		this.bhit = bhit;
	}

//	public void setBgroup(int bgroup) {
//		this.bgroup = bgroup;
//	}
//
//	public void setBstep(int bstep) {
//		this.bstep = bstep;
//	}
//
//	public void setBindent(int bindent) {
//		this.bindent = bindent;
//	}
	
}
