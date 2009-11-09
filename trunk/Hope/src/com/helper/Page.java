package com.helper;

public class Page {
	private int totalRows;
	private int pageSize;
	private int currentPage;
	private int totalPages;
	private int startRow;
    public void config(){
    	
    	totalPages = totalRows / pageSize;
		if (totalRows % pageSize > 0)
		{
			totalPages++;
		}
    	if (currentPage < 1)
		{
    		currentPage=1;
		}
    	if (currentPage>totalPages)
		{
			currentPage=totalPages;
		}
		startRow = (currentPage - 1) * pageSize;
    }
	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public Page() {

	}

}
