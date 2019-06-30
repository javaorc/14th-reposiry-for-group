package com.cskaoyan.bean;

import java.util.List;

public class  PageHelper<T>{
    public static final int PAGE_SIZE = 10;

        private int totalRecordsNum;

        private int currentPageNum;

        private int totalPageNum;

        private int prevPageNum;

        private int nextPageNum;

        private List<T> t;


        public int getTotalRecordsNum() {
            return totalRecordsNum;
        }

        public void setTotalRecordsNum(int totalRecordsNum) {
            this.totalRecordsNum = totalRecordsNum;
        }

        public int getCurrentPageNum() {
            return currentPageNum;
        }

        public void setCurrentPageNum(int currentPageNum) {
            this.currentPageNum = currentPageNum;
        }

        public int getTotalPageNum() {
            return totalPageNum;
        }

        public void setTotalPageNum(int totalPageNum) {
            this.totalPageNum = totalPageNum;
        }

        public int getPrevPageNum() {
            return prevPageNum;
        }

        public void setPrevPageNum(int prevPageNum) {
            this.prevPageNum = prevPageNum;
        }

        public int getNextPageNum() {
            return nextPageNum;
        }

        public void setNextPageNum(int nextPageNum) {
            this.nextPageNum = nextPageNum;
        }

        public List<T> getT() {
            return t;
        }

        public void setT(List<T> t) {
            this.t = t;
        }
}
