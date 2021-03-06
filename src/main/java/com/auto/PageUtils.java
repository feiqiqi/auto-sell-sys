package com.auto;

/**
 * @author 费琪琪
 */
public class PageUtils {

    /**
     *
     */
    public static final Integer PAGE_ROW_COUNT = 10;

    /**
     *
     */
    private Integer pageNumber;

    /**
     *
     */
    // private Integer startRow;

    /**
     *
     */
    private Integer lastPage;

    /**
     *
     */
    private int[] pageButton;

    private Integer pageRowCount;

    public PageUtils(Integer rowCount) {
        this(PAGE_ROW_COUNT, rowCount);
    }

    public PageUtils(Integer pageRowCount, Integer rowCount) {
        this.pageRowCount = pageRowCount;
        //
        this.lastPage = (rowCount + pageRowCount - 1) / pageRowCount;
    }

    public void setPageNumber(Integer pageNumber) {
        if (pageNumber > this.lastPage) {
            this.pageNumber = this.lastPage;
            return;
        }
        this.pageNumber = pageNumber;
    }

    public Integer getPageRowCount() {
        return pageRowCount;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getLastPage() {
        return lastPage;
    }

    public int[] getPageButton() {
        //
        int startPage;
        //
        int endPage;

        if (this.lastPage <= 4) {
            //
            startPage = 1;
            endPage = this.lastPage;
        } else {
            if (this.pageNumber < 4) {
                //
                startPage = 1;
                endPage = 4;
            } else {
                startPage = this.pageNumber - 1;
                endPage = this.pageNumber + 2 <= this.lastPage ? this.pageNumber + 2 : this.lastPage;
                if ((endPage - startPage) <= 2) {
                    startPage = endPage - 3;
                }
            }
        }
        this.pageButton = new int[endPage - (startPage - 1)];
        for (int i = 0; i < pageButton.length; i++) {
            pageButton[i] = startPage++;
        }
        return this.pageButton;
    }

}
